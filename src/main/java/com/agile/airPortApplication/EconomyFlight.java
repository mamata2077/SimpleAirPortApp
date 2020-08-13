package com.agile.airPortApplication;

public class EconomyFlight extends Flight {
//In Economy flight allow to add any passenger but dont allow to remove VIP passenger. 
	public EconomyFlight(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		return passengersList.add(passenger);
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		if (!passenger.isVip()) {
			return passengersList.remove(passenger);
		}
		return false;
	}

}
