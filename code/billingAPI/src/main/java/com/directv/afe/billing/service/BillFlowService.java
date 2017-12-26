package com.directv.afe.billing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import com.directv.afe.billing.domain.BillFlow;
import com.directv.afe.billing.domain.BillResponse;
import com.directv.afe.billing.domain.CustomerType;
import com.directv.afe.billing.ws.client.CustomerClient;
import com.directv.afe.billing.ws.client.InvoiceClient;

@Service
public class BillFlowService {
	
	@Autowired
	CustomerClient customer;
	
	@Autowired
	InvoiceClient invoice;
	
	@Autowired
	@Qualifier("customerResponseChannel")
	private AbstractMessageChannel customerResponseChannel;
	
	@Autowired
	@Qualifier("endChannel")
	private AbstractMessageChannel endChannel;
	
	private static final Logger logger = LoggerFactory.getLogger(BillFlowService.class);
	
	public void getBill(BillFlow dataFlow) {
		customer.getCustomerData(dataFlow, customerResponseChannel);
	}
	
	@Router(inputChannel = "customerResponseChannel", defaultOutputChannel = "endChannel", poller = @Poller(fixedDelay = "1000"))
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

	@ServiceActivator(inputChannel = "addMailChannel", outputChannel = "getInvoiceChannel", poller = @Poller(fixedDelay = "1000"))
	public Message<BillFlow> addMail(Message<BillFlow> msg) {
		customer.addMail(msg.getPayload());
		return msg;
	}
	
	@ServiceActivator(inputChannel = "getInvoiceChannel", poller = @Poller(fixedDelay = "1000"))
	public void getInvoice(Message<BillFlow> msg) {
		invoice.getCustomerBills(msg.getPayload(), endChannel);
	}
	
	@ServiceActivator(inputChannel = "endChannel", poller = @Poller(fixedDelay = "1000"))
	public void buildSendRequest(Message<BillFlow> msg) {
		msg.getPayload().getResponse().setResult(new BillResponse(1, "ok"));
		logger.debug("End of flow.");
	}
}
