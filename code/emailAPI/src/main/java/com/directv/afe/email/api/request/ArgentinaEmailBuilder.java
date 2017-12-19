package com.directv.afe.email.api.request;

import com.directv.afe.email.api.Email;
import com.directv.email.exacttarget.Attribute;
import com.directv.email.exacttarget.CreateRequest;
import com.directv.email.exacttarget.CreateResponse;
import com.directv.email.exacttarget.Subscriber;
import com.directv.email.exacttarget.TriggeredSend;
import com.directv.email.exacttarget.TriggeredSendDefinition;

public class ArgentinaEmailBuilder extends EmailBuilder<CreateResponse> {

	@Override
	public Object createRequest(Email email) {
	
		CreateRequest request = new CreateRequest();
		
		TriggeredSend send = new TriggeredSend();
		
		TriggeredSendDefinition definition = new TriggeredSendDefinition();
		definition.setCustomerKey(email.getTemplate());
		
		Subscriber subscriber = new Subscriber();
		subscriber.setEmailAddress(email.getDestination());
		
		for (String key : email.getAttributes().keySet()) {
			Attribute attr = new Attribute();
			
			attr.setName(key);
			attr.setValue(email.getAttributes().get(key));
			
			subscriber.getAttributes().add(attr);
		} 
		
		subscriber.setSubscriberKey(email.getDestination());
		
		send.getSubscribers().add(subscriber);
		
		send.setTriggeredSendDefinition(definition);	
		
		request.getObjects().add(send);
		return request;
	}

}
