package com.directv.afe.einvoice.api.flow;

import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.directv.afe.einvoice.api.controller.EInvoiceResponse;

@Component
public class ResponseServiceActivator {
	
	
	@Transformer(inputChannel = "sendResponseChannel", poller = @Poller(fixedDelay = "1000")) 
	public void buildSendRequest(Message<EInvoiceFlowRequest> msg) {		
	  	
	 	
        msg.getPayload().getDeferredResult().setResult(new EInvoiceResponse("ok!"));
		
	}

}
