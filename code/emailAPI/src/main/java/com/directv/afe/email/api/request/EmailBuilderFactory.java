package com.directv.afe.email.api.request;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class EmailBuilderFactory {
	
	Map<Country,EmailBuilder<?>> builders = new HashMap<>();
	
	{
		builders.put(Country.AR, new ArgentinaEmailBuilder());
		builders.put(Country.CO, new ColombiaEmailBuilder());
	}
	
	
	public EmailBuilder<?> getBuilder(Country country) {
		
		return builders.get(country);
	}

}
