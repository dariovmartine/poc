package com.directv.afe.email.api;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.email.api.request.Country;
import com.directv.afe.email.api.request.EmailBuilderFactory;
import com.directv.afe.email.api.ws.ArgentinaEmailEndpoint;
import com.directv.afe.email.api.ws.ColombiaEmailEndpoint;
import com.directv.afe.email.api.ws.EmailEndpoint;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="emailController")
public class EmailController {
	
	@Value("${property}")
	String property = null;
	
	@RequestMapping("/")
    public Config config() {
        return new Config(property);
    }	
    
    @Autowired
    EmailBuilderFactory emailBuilderFactory;
    
    private Map<Country, EmailEndpoint> endpoints = new HashMap<>();
    
    @Autowired
    ArgentinaEmailEndpoint argentinaEmailEndpoint;
    
    @Autowired
    ColombiaEmailEndpoint colombiaEmailEndpoint; 
	
    @PostConstruct
	public void postConstruc(String uri) {
		endpoints.put(Country.AR, argentinaEmailEndpoint);
		endpoints.put(Country.CO, colombiaEmailEndpoint);
	}
	
	@ApiOperation(value = "Send a email",response = EmailResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully email delivered"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value="/sendEmail", method= RequestMethod.POST, consumes = "application/json",  produces = "application/json")
    public DeferredResult<EmailResponse> sendEmail(@RequestBody(required = true) Email email) {
    	
    	DeferredResult<EmailResponse> deferredResult = new DeferredResult<>();
    	
    	if (email.getCountry() == null)
    		throw new IllegalArgumentException("country is null");
    	
    	String country = email.getCountry().toUpperCase();
    	
    	if (! Country.contains(country))
    		throw new IllegalArgumentException("country " + country +  " isn't in " +  Country.values());

    	endpoints.get(Country.valueOf(email.getCountry())).sendEmail(deferredResult,
    			emailBuilderFactory.getBuilder(Country.valueOf(email.getCountry())).createRequest(email)
    	);
    	
    	return deferredResult;
    }
}
