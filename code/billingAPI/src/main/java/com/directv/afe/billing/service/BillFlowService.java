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

/**
 * This service is an orchestrator of the flow
 * Every step of the flow will should be here
 * Web Services call receive an output channel to know where to go next
 * 
 * The only purpose to have all Activators here is for readability
 * if it gets messy move activators to his own object
 * @author Marco Capo
 */
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
	
	/**
	 * This is the entry point of the flow
	 * It will try to reach the customer information
	 * To validate if has email and if it's prepaid client
	 * @param dataFlow
	 */
	public void getBill(BillFlow dataFlow) {
		customer.getCustomerData(dataFlow, customerResponseChannel);
	}
	
	/**
	 * It will choose the next step to continue based on customer information
	 * @param msg
	 * @return next channel
	 */
	@Router(inputChannel = "customerResponseChannel", defaultOutputChannel = "endChannel", poller = @Poller(fixedDelay = "1000"))
	public String route(Message<BillFlow> msg) {		
	  	
		String channel = "endChannel";
		BillFlow flowData = msg.getPayload();
		if(flowData.getCustomerType() == CustomerType.PREPAID) {
			if(hasToUpdateMail(flowData)) {
				channel = "addMailChannel";
			}else {
				channel = "getInvoiceChannel";
			}
		}
		logger.info("Channel selected: " + channel + " for requestId: " + flowData.getRequestId());
		
		return channel;
	}
	
	/**
	 * If the request has an email and that email is not already registered
	 * @param userBill
	 * @return boolean if it should update the mail or not
	 */
	private boolean hasToUpdateMail(BillFlow userBill) {
		if(userBill.getEmail() != null && !userBill.getEmail().isEmpty()) {
			for (String mail : userBill.getRegisteredMails()) {
				if(userBill.getEmail().equals(mail)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * This step must update the customer email on ESB
	 * @param msg
	 * @return
	 */
	@ServiceActivator(inputChannel = "addMailChannel", outputChannel = "getInvoiceChannel", poller = @Poller(fixedDelay = "1000"))
	public Message<BillFlow> addMail(Message<BillFlow> msg) {
		customer.addMail(msg.getPayload());
		return msg;
	}
	
	/**
	 * If on request we have a billingId, will try to get that one
	 * If is not sent or is not found it will get the newest bill based on creation date
	 * @param msg
	 */
	@ServiceActivator(inputChannel = "getInvoiceChannel", poller = @Poller(fixedDelay = "1000"))
	public void getInvoice(Message<BillFlow> msg) {
		invoice.getCustomerBills(msg.getPayload(), endChannel);
	}
	
	@ServiceActivator(inputChannel = "endChannel", poller = @Poller(fixedDelay = "1000"))
	public void buildSendRequest(Message<BillFlow> msg) {
		BillFlow bill = msg.getPayload();
		BillResponse response = new BillResponse(BillResponse.OK_CODE, BillResponse.OK_MESSAGE);
		response.setUrl(bill.getUrl());
		
		msg.getPayload().getResponse().setResult(response);
		logger.info("End of flow. Successfully billingURL generated: " + bill.getEmail() + " for requestId: " + bill.getRequestId());
	}
}
