package com.directv.afe.einvoice.api.feign.client;

public class Client {

	private Long id;

	private String name;
	
	public Client() {
		
	}

	public Client(Long id) {
		this.id = id;
		this.name = "no name";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + "]";
	}
	
	

}
