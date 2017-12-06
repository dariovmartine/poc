package com.directv.afe.invoice.api;

public class Invoice  {
	
	public Invoice(Long id, Long clientId) {
		
		this.id = id;
		this.clientId = clientId;
	}

	Long id;
	
	Long clientId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	
	
	
	

}
