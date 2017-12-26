package com.directv.afe.billing.flow;

import java.util.concurrent.Future;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.directv.afe.billing.customer.GetCustomerResponse;
import com.directv.afe.billing.domain.BillResponse;

@MessagingGateway(errorChannel="errorChannel")
public interface BillingGateway {

	@Gateway(requestChannel="customerResponseChannel")
	Future<BillResponse> start(GetCustomerResponse test);
}
