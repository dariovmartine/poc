package com.directv.afe.api.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class ApiGateway {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApiGateway.class).web(WebApplicationType.SERVLET).run(args);
	}
}