package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketReservationSystem {
    private Ticket head = null;

    // Add a new ticket at the end
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        System.out.println("Ticket booked successfully.");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket temp = head, prev = null;
        boolean found = false;

        do {
            if (temp.ticketId == ticketId) {
                found = true;
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("Ticket with ID " + ticketId + " not found.");
            return;
        }

        // Removing head node
        if (temp == head) {
            if (head.next == head) { // Only one node
                head = null;
            } else {
                Ticket last = head;
                while (last.next != head) {
                    last = last.next;
                }
                head = head.next;
                last.next = head;
            }
        } else {
            prev.next = temp.next;
        }

        System.out.println("Ticket with ID " + ticketId + " removed successfully.");
    }

    // Display all booked tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        System.out.println("Current Booked Tickets:");
        Ticket temp = head;
        do {
            displayTicketDetails(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        boolean found = false;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                displayTicketDetails(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found matching \"" + keyword + "\".");
        }
    }

    // Calculate total booked tickets
    public int getTotalTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Helper: Display single ticket details
    private void displayTicketDetails(Ticket ticket) {
        System.out.println("Ticket ID: " + ticket.ticketId);
        System.out.println("Customer Name: " + ticket.customerName);
        System.out.println("Movie Name: " + ticket.movieName);
        System.out.println("Seat Number: " + ticket.seatNumber);
        System.out.println("Booking Time: " + ticket.bookingTime);
        System.out.println("---------------------------");
    }
}

package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class Main {
	public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Adding sample tickets
        system.addTicket(101, "Alice", "Inception", "A1", "2025-07-04 19:00");
        system.addTicket(102, "Bob", "Avatar", "B2", "2025-07-04 20:30");
        system.addTicket(103, "Charlie", "Inception", "C3", "2025-07-05 18:00");

        // Displaying all tickets
        system.displayTickets();

        // Search by customer name or movie name
        System.out.println("\nSearching tickets by keyword 'Inception':");
        system.searchTicket("Inception");

        // Remove a ticket
        System.out.println("\nRemoving ticket with ID 102:");
        system.removeTicket(102);
        system.displayTickets();

        // Total tickets
        System.out.println("Total booked tickets: " + system.getTotalTickets());
    }
}