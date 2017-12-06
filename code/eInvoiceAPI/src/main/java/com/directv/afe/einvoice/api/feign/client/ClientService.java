package com.directv.afe.einvoice.api.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client")
public interface ClientService {

	@RequestMapping("/client")
    public Client client(@RequestParam(value="id") Long id) ;
 
}
