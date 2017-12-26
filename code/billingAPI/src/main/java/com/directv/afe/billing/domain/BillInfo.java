package com.directv.afe.billing.domain;

import java.util.GregorianCalendar;

public class BillInfo {
	
	private long id;
	
	private GregorianCalendar date;
	
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
