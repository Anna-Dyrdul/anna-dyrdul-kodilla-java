package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightService {
    Map<Flight, Boolean> mapOfFlights = new HashMap<>();

    public void createFlight(Flight flight, Boolean isFlying) {
        mapOfFlights.put(flight, isFlying);
    }

    public Map<Flight, Boolean> getMapOfFlights() {
        return mapOfFlights;
    }


    public List<Flight> findFlightFrom(String cityName) {
        return mapOfFlights.entrySet().stream()
                .filter(e -> e.getKey().getDepartureAirport().equals(cityName))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightTo(String cityName) {
        return mapOfFlights.entrySet().stream()
                .filter(e -> e.getKey().getArrivalAirport().equals(cityName))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightThrough(String cityName) {
        return mapOfFlights.entrySet().stream()
                .filter(e -> e.getKey().getIntermediateAirport().equals(cityName))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
