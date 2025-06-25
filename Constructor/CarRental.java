import java.util.Scanner;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double ratePerDay;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.ratePerDay = 1000.0; // Default rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = determineRate(carModel);
    }

    // Determine rate based on car model
    private double determineRate(String model) {
        switch (model.toLowerCase()) {
            case "sedan":
                return 1500.0;
            case "suv":
                return 2000.0;
            case "luxury":
                return 3000.0;
            default:
                return 1000.0; // Standard rate
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return ratePerDay * rentalDays;
    }

    // Display rental details
    public void displayRentalInfo() {
        System.out.println("\nRental Details:");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Rate per Day  : ₹" + ratePerDay);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter car model (Sedan/SUV/Luxury): ");
        String model = scanner.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = scanner.nextInt();

        // Create rental using parameterized constructor
        CarRental rental = new CarRental(name, model, days);

        // Display details
        rental.displayRentalInfo();

        scanner.close();
    }
}
