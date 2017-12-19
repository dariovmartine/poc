package com.directv.afe.email.api.request;

public enum Country {
		CO, AR;

	public static boolean contains(String value) {
		
		for (Country country : values()) {
			if (country.name().equals(value))
				return true;
		}
		return false;
	}
}
