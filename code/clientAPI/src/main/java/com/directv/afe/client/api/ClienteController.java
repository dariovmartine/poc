package com.directv.afe.client.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	@Value("${property}")
	String property = null;
	
	@RequestMapping("/")
    public Config config() {
        return new Config(property);
    }
   
    @RequestMapping("/client")
    public Client client(@RequestParam(value="id") Long id) {
        return new Client(id);
    }
}
