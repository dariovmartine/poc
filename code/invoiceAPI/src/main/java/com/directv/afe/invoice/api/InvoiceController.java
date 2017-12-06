package com.directv.afe.invoice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
	
	@Value("${property}")
	String property = null;
	
	@RequestMapping("/")
    public Config config() {
        return new Config(property);
    }
	
	   
    @RequestMapping("/invoices")
    public Invoice invoice(@RequestParam(value="clientId") Long clientId) {
    	
        return new Invoice(1L, clientId);
    }
}
