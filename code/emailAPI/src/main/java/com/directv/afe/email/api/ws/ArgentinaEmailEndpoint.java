package com.directv.afe.email.api.ws;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.email.api.EmailResponse;
import com.directv.email.exacttarget.CreateRequest;
import com.directv.email.exacttarget.CreateResponse;
import com.directv.email.exacttarget.Soap;

@Component
public class ArgentinaEmailEndpoint extends EmailEndpoint {
	
	private Soap soapService;
    	
	@Value("${endpoints.ar.url}")
	private String url;
	
	class PasswordHandler implements CallbackHandler {

		@Override
		public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
			
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
			 
	        if (pc.getIdentifier().equals("joe")) {
	            // set the password on the callback. This will be compared to the
	            // password which was sent from the client.
	            pc.setPassword("password");
	        }
		}			
	}
	
	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(Soap.class);
		factory.setAddress(url);
		
		Map<String,Object> map = new HashMap<>();
		map.put("action","UsernameToken");
		map.put("passwordType","PasswordDigest");
		map.put("passwordCallbackRef", new PasswordHandler());
		WSHandlerConstants.USER, "joe");
		
		WSS4JInInterceptor wss4j = new WSS4JInInterceptor(map );
				
		factory.getOutInterceptors().add(wss4j);
		soapService = (Soap) factory.create();
		
	}

	@Override
	public void sendEmail(final DeferredResult<EmailResponse> defResponse, Object createRequest) {
		
		soapService.createAsync((CreateRequest)createRequest, new AsyncHandler<CreateResponse>(){

			@Override
			public void handleResponse(Response<CreateResponse> res) {
				
				defResponse.setResult(new EmailResponse(1, "ok"));
			}
		});		
	}
}
