import java.util.Scanner;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
	public HotelBooking() {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    // Method to display booking info
    public void displayBooking() {
        System.out.println("\nBooking Details:");
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter guest name: ");
        String name = scanner.nextLine();
        System.out.print("Enter room type (Standard/Deluxe/Suite): ");
        String room = scanner.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();
        HotelBooking defaultBooking = new HotelBooking();                         
        HotelBooking userBooking = new HotelBooking(name, room, nights);          
        HotelBooking copiedBooking = new HotelBooking(userBooking);
        System.out.println("\n--- Default Booking ---");
        defaultBooking.displayBooking();
        System.out.println("\n--- User Booking ---");
        userBooking.displayBooking();
        System.out.println("\n--- Copied Booking ---");
        copiedBooking.displayBooking();
    }
}
