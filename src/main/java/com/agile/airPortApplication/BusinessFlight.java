package com.agile.airPortApplication;

public class BusinessFlight extends Flight {
	//In business flight do not allow to add non VIP passenger and dont allow to remove passenger
	public BusinessFlight(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		if (passenger.isVip()) {
			return passengersList.add(passenger);
		}
		return false;
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		return false;
	}

}
