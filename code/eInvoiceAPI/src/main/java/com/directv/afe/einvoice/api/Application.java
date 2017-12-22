package com.directv.afe.einvoice.api;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.web.client.AsyncRestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class Application {	
	
	
	/* Esta deprecado pero el web client de Spring 5 no ofrece soporte para ribbon aun */
	@LoadBalanced
	@Bean
	AsyncRestTemplate restTemplate(){
		return new AsyncRestTemplate(); 
	}	
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }   
    
    
//    @Bean
//    public IntegrationFlow myFlow() {
//        return IntegrationFlows
//        		.from("eInvoiceRequestChannel")
//                .get();
//    }

	@Bean(name="eInvoiceRequestChannel")
	public AbstractMessageChannel requestChannel(@Value("${queues.eInvoiceRequestChannel.capacity}") Integer capacity) {
		return new QueueChannel(capacity);
	}
    
	@Bean(name="eInvoiceErrorChannel")
	public AbstractMessageChannel errorChannel(@Value("${queues.eInvoiceErrorChannel.capacity}") Integer capacity) {
		return new QueueChannel(capacity);
	}
	
	@Bean(name="sendEmailChannel")
	public AbstractMessageChannel sendEmailChannel(@Value("${queues.sendEmailChannel.capacity}") Integer capacity) {
		return new QueueChannel(capacity);
	}
	
	@Bean(name="createContactChannel")
	public AbstractMessageChannel createContactChannel(@Value("${queues.createContactChannel.capacity}") Integer capacity) {
		return new QueueChannel(capacity);
	}
	
	@Bean(name="sendResponseChannel")
	public AbstractMessageChannel sendResponseChannel(@Value("${queues.sendResponseChannel.capacity}") Integer capacity) {
		return new QueueChannel(capacity);
	}	
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
	               	.select()
	                .apis(RequestHandlerSelectors.basePackage("com.directv.afe.einvoice.api.controller"))
	                .paths(regex("/invoices.*"))
	                .build().apiInfo(metaData());
    }
	    
    /**
     * metaData: me 
     **/
    private ApiInfo metaData() {
	    	
       ApiInfo apiInfo = new ApiInfo(
    		   "Directv EInovice REST API",
	           "Directv EInvoice REST API",
	           "1.0",
	           "Terms of service",
	           new Contact("Victor Dario Martinez", "https://globallogic.com/", "victor.martinez@globallogic.com"),
	           "Apache License Version 2.0",
	           "https://www.apache.org/licenses/LICENSE-2.0",new ArrayList<VendorExtension>());

	   return apiInfo;
	}    
}
