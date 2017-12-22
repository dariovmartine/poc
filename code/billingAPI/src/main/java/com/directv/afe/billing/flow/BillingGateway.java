package com.directv.afe.billing.flow;

import java.util.concurrent.Future;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.directv.afe.billing.domain.BillResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResponse;

@MessagingGateway(errorChannel="errorChannel")
public interface BillingGateway {

	@Gateway(requestChannel="customerResponseChannel")
	Future<BillResponse> start(GetCustomerResponse test);
}
