package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private final String departureAirport;
    private final String intermediateAirport;
    private final String arrivalAirport;

    public Flight(String departureAirport, String intermediateAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.intermediateAirport = intermediateAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.intermediateAirport = "";
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getIntermediateAirport() {
        return intermediateAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (intermediateAirport != null ? !intermediateAirport.equals(flight.intermediateAirport) : flight.intermediateAirport != null)
            return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + (intermediateAirport != null ? intermediateAirport.hashCode() : 0);
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight {" +
                "departureAirport = '" + departureAirport + '\'' +
                ", intermediateAirport = '" + intermediateAirport + '\'' +
                ", arrivalAirport = '" + arrivalAirport + '\'' +
                '}';
    }
}
