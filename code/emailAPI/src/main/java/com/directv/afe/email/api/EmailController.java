package com.directv.afe.email.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Value("${property}")
	String property = null;
	
	@RequestMapping("/")
    public Config config() {
        return new Config(property);
    }
   
    @RequestMapping("/sendEmail")
    public Response sendEmail(
    		@RequestParam(value="from", required=false ) List<String> senders,
    		@RequestParam(value="to", required=false) List<String> repositories,
    		@RequestParam(value="subject", defaultValue="no subject") String subject,
    		@RequestParam(value="body", defaultValue="no body") String body
    		) {
        return new Response(0, "Email sent");
    }
}
