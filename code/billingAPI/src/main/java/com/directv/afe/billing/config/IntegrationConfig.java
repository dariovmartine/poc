package com.directv.afe.billing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
@IntegrationComponentScan
public class IntegrationConfig {

	@Bean
	public MessageChannel errorChannel() {
		return new DirectChannel();
	}
	
	@Bean
    public MessageChannel customerResponseChannel() {
        return new DirectChannel();
    }
	
	@Bean
    public MessageChannel updateMailChannel() {
        return new DirectChannel();
    }
	@Bean
    public MessageChannel getInvoiceChannel() {
        return new DirectChannel();
    }
	
	@Bean
    public MessageChannel endChannel() {
        return new DirectChannel();
    }
}
