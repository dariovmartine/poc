package com.directv.afe.billing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.context.request.async.DeferredResult;

/**
 * This object will be populated over the flow.
 * @author Marco Capo
 *
 */
public class BillFlow {
	
	private static final int RANDOM_INT = 100000000;
	/*
	 * This param come from request
	 * otherwise a random id will be generated
	 * to keep track of a request on a flow
	 */
	private String requestId;
	
	private CustomerType customerType;
	
	private String email;
	
	private List<String> registeredMails = new ArrayList<String>();
	
	private String customerKey;
	
	private Country country;
	
	private String url;
	

	private BillInfo info;
	
	/*
	 * When this parameter is populated it will be returned to the requester
	 */
	private DeferredResult<BillResponse> response = new DeferredResult<BillResponse>();
	/*
	 * Also know as invoiceID
	 */
	private String billID;

	private String generateRequestId() {
		Random rn = new Random();
		int rnNumber = rn.nextInt(RANDOM_INT) + 1;
		return String.valueOf(rnNumber);
	}
	
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
	public String getRequestId() {
		if(requestId == null) {
			setRequestId(generateRequestId());
		}
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
