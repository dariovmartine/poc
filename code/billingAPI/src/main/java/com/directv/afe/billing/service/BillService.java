package com.directv.afe.billing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import com.directv.afe.billing.domain.BillResponse;
import com.directv.afe.billing.domain.CustomerType;
import com.directv.afe.billing.domain.BillFlow;
import com.directv.afe.billing.ws.client.CustomerClient;

@Service
public class BillService {
	
	@Autowired
	CustomerClient customer;
	
	private static final Logger logger = LoggerFactory.getLogger(BillService.class);
	
	public void getBill(BillFlow userBill) {
		customer.getCustomerData(userBill);
	}
	
	@Router(inputChannel = "customerResponseChannel", defaultOutputChannel = "endChannel")
	public String route(Message<BillFlow> msg) {		
	  	
		String channel = "endChannel";
		BillFlow userBill = msg.getPayload();
		if(userBill.getCustomerType() == CustomerType.PREPAID) {
			if(hasToUpdateMail(userBill)) {
				channel = "addMailChannel";
			}else {
				channel = "getInvoiceChannel";
			}
		}
		logger.debug("Channel selected: " + channel);
		
		return channel;
	}
	
	/**
	 * If the request has an email and that email is not already registered
	 * @param userBill
	 * @return boolean if it should update the mail or not
	 */
	private boolean hasToUpdateMail(BillFlow userBill) {
		if(!userBill.getEmail().isEmpty()) {
			for (String mail : userBill.getRegisteredMails()) {
				if(userBill.getEmail().equals(mail)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@ServiceActivator(inputChannel = "addMailChannel", outputChannel = "getInvoiceChannel")
	public Message<BillFlow> addMail(Message<BillFlow> msg) {
		customer.addMail(msg.getPayload());
		return msg;
	}
	
	@ServiceActivator(inputChannel = "getInvoiceChannel", outputChannel = "endChannel")
	public Message<BillFlow> getInvoice(Message<BillFlow> msg) {
		return msg;
	}
	
	@ServiceActivator(inputChannel = "endChannel")
	public void buildSendRequest(Message<BillFlow> msg) {
		msg.getPayload().getResponse().setResult(new BillResponse(1, "ok"));
		logger.debug("End of flow.");
	}
}
