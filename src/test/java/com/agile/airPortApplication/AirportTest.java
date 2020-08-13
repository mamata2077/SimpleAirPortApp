package com.agile.airPortApplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AirportTest {

    @Test
    public void testEconomyFlightForUsualPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger mamata = new Passenger("Mamata", false);

        assertEquals("1", economyFlight.getId());
        assertEquals(true, economyFlight.addPassenger(mamata));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("Mamata", economyFlight.getPassengersList().get(0).getName());

        assertEquals(true, economyFlight.removePassenger(mamata));
        assertEquals(0, economyFlight.getPassengersList().size());
    }

    @Test
    public void testEconomyFlightForVipPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger sonal = new Passenger("Sonal", true);

        assertEquals("1", economyFlight.getId());
        assertEquals(true, economyFlight.addPassenger(sonal));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("Sonal", economyFlight.getPassengersList().get(0).getName());

        assertEquals(false, economyFlight.removePassenger(sonal));
        assertEquals(1, economyFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightForUsualPassenger() {
        Flight businessFlight = new BusinessFlight("2");

        Passenger mamata = new Passenger("Mamata", false);

        assertEquals(false, businessFlight.addPassenger(mamata));
        assertEquals(0, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(mamata));
        assertEquals(0, businessFlight.getPassengersList().size());

    }

    @Test
    public void testBusinessFlightForVipPassenger() {
        Flight businessFlight = new BusinessFlight("2");

        Passenger mamata = new Passenger("Mamata", true);

        assertEquals(true, businessFlight.addPassenger(mamata));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(mamata));
        assertEquals(1, businessFlight.getPassengersList().size());

    }
}
