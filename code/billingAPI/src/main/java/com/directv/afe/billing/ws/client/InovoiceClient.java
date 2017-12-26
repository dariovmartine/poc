package com.directv.afe.billing.ws.client;

import javax.annotation.PostConstruct;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.channel.AbstractMessageChannel;

import com.directv.afe.billing.domain.BillFlow;
import com.directvla.contract.businessdomain.managebillingevents.v1_0.ManageBillingEventsPt;
import com.directvla.schema.businessdomain.managebillingevents.v1_0.GetCustomerInvoicesRequest;

public class InovoiceClient {

	@Value("${service.invoice.url}")
	private String url;
	
	private ManageBillingEventsPt soapService;

	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ManageBillingEventsPt.class);
		factory.setAddress(url);
		soapService = (ManageBillingEventsPt) factory.create();
	}
	
	public void getCustomerBills(BillFlow userBill, AbstractMessageChannel outputChannel) {
		
		GetCustomerInvoicesRequest request = new GetCustomerInvoicesRequest();
		
		//soapService.getCustomerInvoicesAsync(request, asyncHandler);
	}
}
