package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public static void main(String[] args) {
        Airport airport=new Airport();

        Flight flight = new Flight("B-2351", Status.DELETED);
        airport.addFlight(flight);
        flight = new Flight("N-312561", Status.DELETED);
        airport.addFlight(flight);
        flight = new Flight("S-35", Status.DELETED);
        airport.addFlight(flight);
        flight = new Flight("A-12345", Status.ACTIVE);
        airport.addFlight(flight);
        flight = new Flight("B-1234", Status.ACTIVE);
        airport.addFlight(flight);

        String deletedFlights = airport.getDeletedFlights();

        System.out.println(deletedFlights);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok:\n");
        for (Flight flight : flights)
            if (flight.getStatus() == Status.DELETED)
                sb.append(flight.getFlightNumber()+"\n");
        return sb.toString();
    }


}
