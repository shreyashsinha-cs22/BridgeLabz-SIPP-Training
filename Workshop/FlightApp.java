import java.util.*;

class Flight {
    String flightNumber;
    String source;
    String destination;

    public Flight(String flightNumber, String source, String destination) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
    }

    public String toString() {
        return flightNumber + " - " + source + " to " + destination;
    }
}

class Booking {
    String passengerName;
    Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public String toString() {
        return "Passenger: " + passengerName + ", Flight: " + flight;
    }
}

class FlightBookingSystem {
    Flight[] flights; // Array of available flights
    List<Booking> bookings = new ArrayList<>(); // List of bookings

    public FlightBookingSystem(Flight[] flights) {
        this.flights = flights;
    }

    // Method to search for flights (case-insensitive)
    public List<Flight> searchFlights(String source, String destination) {
        List<Flight> results = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.source.equalsIgnoreCase(source) &&
                flight.destination.equalsIgnoreCase(destination)) {
                results.add(flight);
            }
        }
        return results;
    }

    // Method to book a flight
    public void bookFlight(String passengerName, Flight flight) {
        bookings.add(new Booking(passengerName, flight));
        System.out.println("Booking successful for " + passengerName);
    }

    // Method to display all bookings
    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}

public class FlightApp {
    public static void main(String[] args) {
        // Step 1: Initialize flight data
        Flight[] availableFlights = {
            new Flight("AI101", "Delhi", "Mumbai"),
            new Flight("AI102", "Mumbai", "Delhi"),
            new Flight("AI103", "Delhi", "Bangalore"),
            new Flight("AI104", "Bangalore", "Mumbai"),
            new Flight("AI105", "Delhi", "Chennai")
        };

        // Step 2: Create the system
        FlightBookingSystem system = new FlightBookingSystem(availableFlights);

        // Step 3: Simulate some operations
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source city: ");
        String source = scanner.nextLine();

        System.out.println("Enter destination city: ");
        String destination = scanner.nextLine();

        List<Flight> foundFlights = system.searchFlights(source, destination);
        if (foundFlights.isEmpty()) {
            System.out.println("No flights found.");
        } else {
            System.out.println("Available flights:");
            for (int i = 0; i < foundFlights.size(); i++) {
                System.out.println((i + 1) + ". " + foundFlights.get(i));
            }

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Select flight number (1 to " + foundFlights.size() + "):");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= foundFlights.size()) {
                system.bookFlight(name, foundFlights.get(choice - 1));
            } else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.println("\n--- All Bookings ---");
        system.displayBookings();
    }
}
