package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(new Flight("Airport 2", "Airport 5"));
        } catch (RouteNotFoundException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("All done!");
        }


    }
}
