package com.directv.afe.einvoice.api.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;

@Component
public class EmailServiceActivator {
	
	@Autowired
	private AsyncRestTemplate restTemplate;	
	
	@Autowired
	@Qualifier("createContactChannel")
	AbstractMessageChannel outputChannel;
	
	@Autowired
	@Qualifier("eInvoiceErrorChannel")
	AbstractMessageChannel eInvoiceErrorChannel;
	
	@ServiceActivator(inputChannel = "sendEmailChannel", poller = @Poller(fixedDelay = "1000"))
	public void buildSendRequest(Message<EInvoiceFlowRequest> msg) {		
        
		Email email = new Email();
		HttpEntity<Email> request = new HttpEntity<>(email);
		
		ListenableFuture<ResponseEntity<EmailResponse>> response = restTemplate
			.exchange("http://email/sendEmail", HttpMethod.POST, request, EmailResponse.class);

		response.addCallback(new ListenableFutureCallback<ResponseEntity<EmailResponse>>() {
	        
			@Override
	        public void onSuccess(ResponseEntity<EmailResponse>  response) {
				
				
				outputChannel.send(msg);
	        }

	        @Override
	        public void onFailure(Throwable t) {
	        	
	        	

	        	eInvoiceErrorChannel.send(msg);
	            
	        }
	    });
	}
}
