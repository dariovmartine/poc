package com.directv.afe.email.api.ws;

import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.email.api.EmailResponse;

public abstract class EmailEndpoint {

	public abstract void sendEmail(DeferredResult<EmailResponse> defResponse, Object createRequest);	

}
