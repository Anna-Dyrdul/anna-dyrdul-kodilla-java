package com.kodilla.good.patterns.challenges.flights;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FlightServiceTestSuite {
    private static FlightService flightService = new FlightService();

    @BeforeAll
    public static void beforeAllTests() {
        flightService.createFlight(new Flight("Gdańsk", "Wrocław"),true);
        flightService.createFlight(new Flight("Wrocław", "Gdańsk"),true);
        flightService.createFlight(new Flight("Porto", "Warszawa"), true);
        flightService.createFlight(new Flight("Gdańsk", "Kraków"),true);
    }

    @Test
    void testCreateFlight() {
        //Given
        //When
        Map<Flight, Boolean> mapOfFlights = flightService.getMapOfFlights();
        //Then
        assertEquals(4, mapOfFlights.size());
    }

    @Test
    void testFindFlightFrom() {
        //Given
        //When
        List<Flight> listOfFlightsFromChosenCity = flightService.findFlightFrom("Wrocław");
        //Then
        assertEquals(1, listOfFlightsFromChosenCity.size());
    }

    @Test
    void testFindFlightTo() {
        //Given
        //When
        List<Flight> listOfFlightsToChosenCity  = flightService.findFlightTo("Gdańsk");
        //Then
        assertEquals(1, listOfFlightsToChosenCity.size());
    }

    @Test
    void testFindFlightThrough() {
        //Given
        //When
        List<Flight> listOfFlightsThroughChosenCity = flightService.findFlightThrough("Kraków");
        //Then
        assertEquals(1, listOfFlightsThroughChosenCity.size());
    }
}
