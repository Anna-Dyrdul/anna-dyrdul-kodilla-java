package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> mapOfFlights = new HashMap<>();

        mapOfFlights.put("Airport 1", true);
        mapOfFlights.put("Airport 2", false);
        mapOfFlights.put("Airport 3", true);
        mapOfFlights.put("Airport 4", false);


        if(mapOfFlights.containsKey(flight.getDepartureAirport())){
            System.out.println(flight.getDepartureAirport() + ". We can take the flight: " + mapOfFlights.get(flight.getDepartureAirport()));
        } else {
            throw new RouteNotFoundException();
        }

    }

}
