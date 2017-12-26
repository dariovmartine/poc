package com.directv.afe.billing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
@IntegrationComponentScan
public class IntegrationConfig {

	@Bean(name="errorChannel")
	public AbstractMessageChannel errorChannel(@Value("${queues.billingAPI.channel.capacity}") Integer capacity) {
		return new QueueChannel(capacity);
	}
	
	@Bean
    public MessageChannel customerResponseChannel() {
        return new DirectChannel();
    }
	
	@Bean
    public MessageChannel addMailChannel() {
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
