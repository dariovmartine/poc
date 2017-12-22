package com.directv.afe.einvoice.api.controller;

public class EInvoiceResponse {
	
	String message;
	
	
	public EInvoiceResponse(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
