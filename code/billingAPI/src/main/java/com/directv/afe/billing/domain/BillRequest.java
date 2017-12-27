package com.directv.afe.billing.domain;

import java.util.Map;

public class BillRequest {
	
	private String requestId;
	
	private String country;
	
	private String customerKey;
	
	private String email;
	
	/**
	 * invoiceID or billID
	 * This param is optional, if it has an invoiceID, it will retrieve that bill if exist.
	 */
	private String invoiceID;
	
	private Map<String,String> attributes;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getCustomerKey() {
		return customerKey;
	}

	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBillID() {
		return invoiceID;
	}

	public void setBillID(String billID) {
		this.invoiceID = billID;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
