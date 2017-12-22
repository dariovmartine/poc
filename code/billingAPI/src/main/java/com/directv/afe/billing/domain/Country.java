package com.directv.afe.billing.domain;

public enum Country {
	// TT = CARIBE
		CO, AR, TT;

	public static boolean contains(String value) {
		for (Country country : values()) {
			if (country.name().equals(value))
				return true;
		}
		return false;
	}

	public static Country parseString(String value) {
		for (Country country : values()) {
			if (country.name().equals(value))
				return country;
		}
		return null;
	}
}
