package com.directv.afe.email.api.ws;

import javax.annotation.PostConstruct;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.email.api.EmailResponse;
import com.directv.email.computec.WsDirectvIVR;

@Component
public class ColombiaEmailEndpoint extends EmailEndpoint {

	private WsDirectvIVR soapService;
	
	@Value("${endpoints.co.url}")
	private String url;
	
	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(WsDirectvIVR.class);
		factory.setAddress(url);
		soapService = (WsDirectvIVR) factory.create();
	}

	@Override
	public void sendEmail(DeferredResult<EmailResponse> defResponse, Object createRequest) {
		
		
	}



}
