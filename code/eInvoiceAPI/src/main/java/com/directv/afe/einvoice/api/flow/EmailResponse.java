package com.directv.afe.einvoice.api.flow;

public class EmailResponse {

	private int status;
	private String message;
	
	public EmailResponse() {
		
		
	}

	public EmailResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + "]";
	}
	
	

}
