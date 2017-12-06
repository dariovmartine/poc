package com.directv.afe.einvoice.api.feign.email;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("email")
public interface EmailService {
	
	@RequestMapping("/sendEmail")
    public Response sendEmail(
    		@RequestParam(value="from", required=false ) List<String> senders,
    		@RequestParam(value="to", required=false) List<String> repositories,
    		@RequestParam(value="subject", defaultValue="no subject") String subject,
    		@RequestParam(value="body", defaultValue="no body") String body
    		);

}
