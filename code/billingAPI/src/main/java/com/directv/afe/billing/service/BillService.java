package com.directv.afe.billing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import com.directv.afe.billing.domain.CustomerType;
import com.directv.afe.billing.domain.UserBill;
import com.directv.afe.billing.ws.client.CustomerClient;

@Service
public class BillService {
	
	@Autowired
	CustomerClient customer;
	
	public void getBill(UserBill userBill) {
		customer.getCustomer(userBill);
	}
	
	@Router(inputChannel = "customerResponseChannel", defaultOutputChannel = "endChannel")
	public String route(Message<UserBill> msg) {		
	  	
		String channel = "endChannel";
		UserBill userBill = msg.getPayload();
		if(userBill.getCustomerType() == CustomerType.PREPAID) {
			if(!userBill.getEmail().isEmpty()) {
				channel = "updateMailChannel";
			}else {
				channel = "getInvoiceChannel";
			}
		}
		System.out.println(channel);
		
		return channel;
	}
	
	@ServiceActivator(inputChannel = "endChannel")
	public void buildSendRequest(Message<UserBill> msg) {		
	  	
		System.out.println(msg);
        
	}
}
