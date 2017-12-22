package com.directv.afe.einvoice.api.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CreateContactServiceActivator {
	
	@Autowired
	@Qualifier("sendResponseChannel")
	AbstractMessageChannel outputChannel;
	
	@Autowired
	@Qualifier("eInvoiceErrorChannel")
	AbstractMessageChannel eInvoiceErrorChannel;
	
	@ServiceActivator(inputChannel = "createContactChannel", poller = @Poller(fixedDelay = "1000"))
	public void buildSendRequest(Message<EInvoiceFlowRequest> msg) {		
        
		outputChannel.send(msg);
	}

}
