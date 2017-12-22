package com.directv.afe.einvoice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.einvoice.api.Config;
import com.directv.afe.einvoice.api.flow.EInvoiceFlowRequest;
import com.directv.afe.einvoice.api.flow.EInvoiceGateway;


@RestController
public class EInvoiceController {	
	
	@RequestMapping("/")
    public Config config() {
        return new Config("E-invoice");
    }	
	
	@Autowired
	EInvoiceGateway eInvoiceGateway;
   
    @RequestMapping(value = "/invoices", method= RequestMethod.POST, consumes = "application/json",  produces = "application/json")
    public DeferredResult<EInvoiceResponse> einvoice(@RequestBody(required = true) EInvoiceRequest eInvoiceRequest) {
    	
    	DeferredResult<EInvoiceResponse> deferredResult = new DeferredResult<>();
    	
    	eInvoiceGateway.sendRequest(new EInvoiceFlowRequest(deferredResult, eInvoiceRequest));
    	
        return deferredResult;
    }
}
