package com.directv.afe.billing.ws.client;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.annotation.PostConstruct;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.directv.afe.billing.domain.BillFlow;
import com.directv.afe.billing.domain.BillInfo;
import com.directv.afe.billing.domain.BillResponse;
import com.directv.afe.billing.invoice.GetCustomerInvoices;
import com.directv.afe.billing.invoice.GetCustomerInvoicesRequest;
import com.directv.afe.billing.invoice.GetCustomerInvoicesResponse;
import com.directv.afe.billing.invoice.Invoice;
import com.directv.afe.billing.invoice.ManageBillingEventsPt;
import com.directv.afe.billing.invoice.RequestMetadataType;

@Component
public class InvoiceClient {

	private static final Logger logger = LoggerFactory.getLogger(InvoiceClient.class);
	
	@Value("${service.invoice.url}")
	private String url;
	
	@Autowired
	private AbstractMessageChannel errorChannel;
	
	private ManageBillingEventsPt soapService;
	
	private static final int RANDOM_INT = 100000000;

	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ManageBillingEventsPt.class);
		factory.setAddress(url);
		soapService = (ManageBillingEventsPt) factory.create();
	}
	
	private String getRequestId() {
		Random rn = new Random();
		int rnNumber = rn.nextInt(RANDOM_INT) + 1;
		return String.valueOf(rnNumber);
	}
	
	private RequestMetadataType getRequestMetadataType(String country) {
		RequestMetadataType requestMetadataType = new RequestMetadataType();
		requestMetadataType.setRequestID(getRequestId());
		requestMetadataType.setSourceID(country);
		return requestMetadataType;
	}
	
	public void getCustomerBills(BillFlow userBill, AbstractMessageChannel outputChannel) {
		
		GetCustomerInvoicesRequest request = new GetCustomerInvoicesRequest();
		request.setRequestMetadata(getRequestMetadataType(userBill.getCountry().toString()));
		GetCustomerInvoices invoice = new GetCustomerInvoices();
		invoice.setCustomerKey(userBill.getCustomerKey());
		request.setGetCustomerInvoices(invoice);
		
		soapService.getCustomerInvoicesAsync(request, new AsyncHandler<GetCustomerInvoicesResponse>() {

			@Override
			public void handleResponse(Response<GetCustomerInvoicesResponse> res) {
				try {
					if (res.get() instanceof GetCustomerInvoicesResponse) {
						BillInfo info = getBillInfo(userBill, res.get().getGetCustomerInvoicesResult().getInvoiceCollection().getInvoices());
						
						if(info != null) {
							userBill.setInfo(info);
							Message<BillFlow> message = MessageBuilder.withPayload(userBill).build();
							outputChannel.send(message);
						}else {
							logger.error("Couldn't get any billing.");
							BillResponse response = new BillResponse(BillResponse.RESOURCE_ERROR_CODE, BillResponse.RESOURCE_ERROR_MESSAGE);
							Message<BillResponse> message = MessageBuilder.withPayload(response).build();
							errorChannel.send(message);
						}
					}
				} catch (InterruptedException | ExecutionException execution) {
					logger.error("Couldn't get invoice information.");
					BillResponse response = new BillResponse(BillResponse.RESOURCE_ERROR_CODE, BillResponse.RESOURCE_ERROR_MESSAGE);
					Message<BillResponse> message = MessageBuilder.withPayload(response).build();
					errorChannel.send(message);
				}

			}
		});
	}

	protected BillInfo getBillInfo(BillFlow userBill, List<Invoice> list) {
		if(!userBill.getBillID().isEmpty()) {
			for (Invoice invoice : list) {
				if(invoice.getID() == Integer.parseInt(userBill.getBillID())) {
					return parceInvoce(invoice);
				}
			}
		}else {
			Invoice lastInvoice = null;
			for (Invoice invoice : list) {
				if(lastInvoice == null || invoice.getCreateDate().compare(lastInvoice.getCreateDate()) > 1) {
					lastInvoice = invoice;
				}
			}
			return parceInvoce(lastInvoice); 
		}
		return null;
	}

	private BillInfo parceInvoce(Invoice invoice) {
		BillInfo info = new BillInfo();
		info.setId(invoice.getID());
		info.setStatus(invoice.getStatus());
		info.setDate(invoice.getCreateDate().toGregorianCalendar());
		return info;
	}
}
