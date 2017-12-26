package com.directv.afe.billing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.channel.QueueChannel;

@Configuration
@IntegrationComponentScan
public class IntegrationConfig {

	@Bean(name="errorChannel")
	public AbstractMessageChannel errorChannel(@Value("${queues.capacity.error}") Integer capacity) {
		return new QueueChannel(capacity);
	}
	
	@Bean(name="customerResponseChannel")
    public AbstractMessageChannel customerResponseChannel(@Value("${queues.capacity.cutomer}") Integer capacity) {
		return new QueueChannel(capacity);
    }
	
	@Bean(name="addMailChannel")
    public AbstractMessageChannel addMailChannel(@Value("${queues.capacity.mail}") Integer capacity) {
		return new QueueChannel(capacity);
    }
	@Bean(name="getInvoiceChannel")
    public AbstractMessageChannel getInvoiceChannel(@Value("${queues.capacity.invoice}") Integer capacity) {
		return new QueueChannel(capacity);
    }
	
	@Bean(name="endChannel")
    public AbstractMessageChannel endChannel(@Value("${queues.capacity.end}") Integer capacity) {
		return new QueueChannel(capacity);
    }
}
