package com.directv.afe.client.api;

public class Client {

	private Long id;

	private String name;

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

}
