package com.directv.afe.billing.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.context.request.async.DeferredResult;

/**
 * This object will be populated over the flow.
 * @author Marco Capo
 *
 */
public class BillFlow {
	
	private CustomerType customerType;
	
	private String email;
	
	private List<String> registeredMails = new ArrayList<String>();
	
	private String customerKey;
	
	private Country country;
	
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public BillInfo getInfo() {
		return info;
	}

	public void setInfo(BillInfo info) {
		this.info = info;
	}

	private BillInfo info;
	
	// TODO: Try to avoid passing through the response on the objects
	// search for a better way to return it.
	private DeferredResult<BillResponse> response = new DeferredResult<BillResponse>();
	/*
	 * Also know as invoiceID
	 */
	private String billID;

	public String getCustomerKey() {
		return customerKey;
	}

	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DeferredResult<BillResponse> getResponse() {
		return response;
	}

	public String getBillID() {
		return billID;
	}

	public void setBillID(String billID) {
		this.billID = billID;
	}

	public List<String> getRegisteredMails() {
		return registeredMails;
	}

	public void setRegisteredMails(List<String> registeredMails) {
		this.registeredMails = registeredMails;
	}

}
