package com.directv.afe.einvoice.api.flow;

import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.einvoice.api.controller.EInvoiceRequest;
import com.directv.afe.einvoice.api.controller.EInvoiceResponse;

public class EInvoiceFlowRequest {
	
	private DeferredResult<EInvoiceResponse> deferredResult;
	
	private EInvoiceRequest eInvoiceRequest;
		
	public EInvoiceFlowRequest(DeferredResult<EInvoiceResponse> deferredResult, EInvoiceRequest eInvoiceRequest) {
		this.deferredResult = deferredResult;
		this.eInvoiceRequest = eInvoiceRequest;
	}

	public DeferredResult<EInvoiceResponse> getDeferredResult() {
		return deferredResult;
	}

	public EInvoiceRequest geteInvoiceRequest() {
		return eInvoiceRequest;
	}
	
	

}
