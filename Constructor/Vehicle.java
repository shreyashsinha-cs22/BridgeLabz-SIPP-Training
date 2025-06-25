import java.util.Scanner;
public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared for all vehicles)
    private static double registrationFee = 1500.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : ₹" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("\nRegistration fee updated to ₹" + registrationFee);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first vehicle details
        System.out.print("Enter owner's name: ");
        String owner1 = scanner.nextLine();

        System.out.print("Enter vehicle type (Car/Bike/Truck): ");
        String type1 = scanner.nextLine();

        Vehicle v1 = new Vehicle(owner1, type1);
        v1.displayVehicleDetails();

        // Update registration fee
        System.out.print("\nEnter new registration fee: ");
        double newFee = scanner.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        scanner.nextLine(); // consume newline

        // Input second vehicle details
        System.out.print("\nEnter owner's name: ");
        String owner2 = scanner.nextLine();
        System.out.print("Enter vehicle type: ");
        String type2 = scanner.nextLine();
        Vehicle v2 = new Vehicle(owner2, type2);
        v2.displayVehicleDetails();
    }
}
