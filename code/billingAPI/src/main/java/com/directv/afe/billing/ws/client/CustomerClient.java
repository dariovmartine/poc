package com.directv.afe.billing.ws.client;

import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.annotation.PostConstruct;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import com.directv.afe.billing.domain.BillResponse;
import com.directv.afe.billing.domain.Country;
import com.directv.afe.billing.domain.CustomerType;
import com.directv.afe.billing.domain.UserBill;
import com.directvla.contract.businessdomain.crmsupportandreadiness.v1_0.CRMSupportAndReadinessPt;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomer;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResponse;
import com.directvla.schema.businessdomain.customer.v1_0.Customer;
import com.directvla.schema.util.commondatatypes.v1_0.RequestMetadataType;

@Component
public class CustomerClient {
	
	
	private static final Long PREPAID_ACCOUNT_IDENTIFIER = 1l;
	private static final Long PREPAID_ACCOUNT_IDENTIFIER_TT = 27l;
	
	private static final int RANDOM_INT = 100000000;

	private CRMSupportAndReadinessPt soapService;
	
	@Autowired
	private MessageChannel customerResponseChannel;

	@Value("${service.customer.url}")
	private String url;

	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CRMSupportAndReadinessPt.class);
		factory.setAddress(url);
		soapService = (CRMSupportAndReadinessPt) factory.create();
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

	/**
	 * 
	 * Returns a customer account by Customer ID or null
	 * CRMSupportAndReadiness.GetCustomer Web Service Client.
	 * @param deferredResult 
	 * 
	 * @param customerKey
	 * @param countryCode
	 * @return {@link Customer}
	 */
	public void getCustomer(UserBill userBill) {

		GetCustomer customer = new GetCustomer();
		customer.setCustomerKey(userBill.getCustomerKey());
		GetCustomerRequest getCustomerRequest = new GetCustomerRequest();
		getCustomerRequest.setGetCustomer(customer);
		getCustomerRequest.setRequestMetadata(getRequestMetadataType(userBill.getCountry().toString()));

		soapService.getCustomerAsync((GetCustomerRequest) getCustomerRequest, new AsyncHandler<GetCustomerResponse>() {

			@Override
			public void handleResponse(Response<GetCustomerResponse> res) {
				try {
					if (res.get() instanceof GetCustomerResponse) {
						userBill.getResponse().setResult(new BillResponse(1, "ok"));
						
						CustomerType customerType = getCustomerType(res.get().getGetCustomerResult().getCustomer());
						userBill.setCustomerType(customerType);
						Message<UserBill> message = MessageBuilder.withPayload(userBill).build();
						customerResponseChannel.send(message);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}	
			
			private CustomerType getCustomerType(Customer customer) {
				if(!isPrepaidAccount(customer, userBill.getCountry())) {
					return CustomerType.POSTPAID;
				}
				return CustomerType.PREPAID;
			}
			
			/**
			 *  It validates account type based on the account rank
			 * @param customer
			 * @param countryCode
			 * @return
			 */
			private boolean isPrepaidAccount(Customer customer, Country country) {
				if (Country.TT == country) {
					return PREPAID_ACCOUNT_IDENTIFIER_TT.equals(customer.getCustomerRank());
				}
				return PREPAID_ACCOUNT_IDENTIFIER.equals(customer.getCustomerRank());
			}	
		});
	}

}
