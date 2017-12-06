package com.directv.afe.einvoice.api.feign.invoice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("invoice")
public interface InvoiceService {
	
	 @RequestMapping("/invoices")
	    public Invoice invoice(@RequestParam(value="clientId") Long clientId) ;
	   

}
