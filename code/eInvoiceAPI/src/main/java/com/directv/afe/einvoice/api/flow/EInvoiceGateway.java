package com.directv.afe.einvoice.api.flow;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway(errorChannel = "eInvoiceErrorChannel")
public interface EInvoiceGateway {

	@Gateway(requestChannel = "eInvoiceRequestChannel")
	EInvoiceFlowResult sendRequest(EInvoiceFlowRequest message);
}
