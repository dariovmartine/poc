package com.directv.afe.einvoice.api.feign.invoice;

public class Invoice  {
	
	public Invoice() {
		
	}
	
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

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", clientId=" + clientId + "]";
	}
	
	
	
	

}
