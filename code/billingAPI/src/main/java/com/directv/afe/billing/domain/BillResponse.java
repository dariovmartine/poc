package com.directv.afe.billing.domain;

import java.util.Map;

public class BillResponse {
	
	public static final int OK_CODE = 200;
	public static final String OK_MESSAGE = "Successfully bill delivered";
	
	public static final int UNAUTHORIZED_CODE = 401;
	public static final String UNAUTHORIZED_MESSAGE = "You are not authorized to view the resource";
	
	public static final int FORBIDDEN_CODE = 403;
	public static final String FORBIDDEN_MESSAGE = "Accessing the resource you were trying to reach is forbidden";
	
	public static final int NOT_FOUND_CODE = 404;
	public static final String NOT_FOUND_MESSAGE = "The resource you were trying to reach is not found";
	
	public static final int RESOURCE_ERROR_CODE = 405;
	public static final String RESOURCE_ERROR_MESSAGE = "Error trying to reach a resource";
	
	private int status;
	private String message;
	private String url;
	
	private Map<String,String> attributes;

	public BillResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
