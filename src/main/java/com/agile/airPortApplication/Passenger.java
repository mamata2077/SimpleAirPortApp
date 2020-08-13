package com.agile.airPortApplication;

public class Passenger {

	private String name;
	private boolean isVip;

	public Passenger(String name, boolean isVip) {
		this.name = name;
		this.isVip = isVip;
	}

	public String getName() {
		return name;
	}

	public boolean isVip() {
		return isVip;
	}

}
