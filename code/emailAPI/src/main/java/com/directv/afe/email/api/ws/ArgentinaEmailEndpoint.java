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

import org.apache.cxf.Bus;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
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
	
	@Value("${endpoints.ar.username}")
	private String username;
	
	@Value("${endpoints.ar.password}")
	private String password;
			
	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(Soap.class);
		factory.setAddress(url);
				
		Map<String,Object> map = new HashMap<>();
		map.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		map.put(WSHandlerConstants.PASSWORD_TYPE,  WSConstants.PW_TEXT);
		map.put(WSHandlerConstants.PW_CALLBACK_REF, new PasswordHandler());
		map.put(WSHandlerConstants.USER, username);
		
		LoggingInInterceptor logIn = new LoggingInInterceptor();
		logIn.setPrettyLogging(true);
		LoggingOutInterceptor logOut = new LoggingOutInterceptor();
		logOut.setPrettyLogging(true);
		
		WSS4JOutInterceptor wss4j = new WSS4JOutInterceptor(map );
		
		factory.getInInterceptors().add(logIn);
		factory.getOutInterceptors().add(logOut);
		factory.getOutInterceptors().add(wss4j);
		
		soapService = (Soap) factory.create();
		
	}

	@Override
	public void sendEmail(final DeferredResult<EmailResponse> defResponse, Object createRequest) {
		
		soapService.createAsync((CreateRequest)createRequest, new AsyncHandler<CreateResponse>(){

			@Override
			public void handleResponse(Response<CreateResponse> res) {
				
				try {
					res.get();
					defResponse.setResult(new EmailResponse(0, "ok"));
				} catch (Exception e) {
					defResponse.setResult(new EmailResponse(1, "fail: " + e.getMessage()));
				}
			}
		});		
	}
	
	class PasswordHandler implements CallbackHandler {

		@Override
		public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
			
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
			 
	        if (pc.getIdentifier().equals(username)) {
	            // set the password on the callback. This will be compared to the
	            // password which was sent from the client.
	            pc.setPassword(password);
	        }
		}			
	}

}
