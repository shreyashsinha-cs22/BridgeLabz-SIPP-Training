import java.util.*;
class Vehicle {
    static double registrationFee = 5000.0;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final: cannot be changed
    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("\nRegistration fee updated to ₹" + registrationFee);
    }
    // Method to display vehicle registration details using instanceof
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("\n--- Vehicle Registration Details ---");
            System.out.println("Owner Name         : " + ownerName);
            System.out.println("Vehicle Type       : " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee   : ₹" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle Object.");
        }
    }
}

class VehicleSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter owner name: ");
        String owner1 = sc.nextLine();
        System.out.print("Enter vehicle type: ");
        String type1 = sc.nextLine();
        System.out.print("Enter registration number: ");
        String regNum1 = sc.nextLine();
        Vehicle v1 = new Vehicle(owner1, type1, regNum1);
        v1.displayRegistrationDetails();
        System.out.print("\nEnter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        sc.nextLine();
        System.out.print("\nEnter owner name: ");
        String owner2 = sc.nextLine();
        System.out.print("Enter vehicle type: ");
        String type2 = sc.nextLine();
        System.out.print("Enter registration number: ");
        String regNum2 = sc.nextLine();
        Vehicle v2 = new Vehicle(owner2, type2, regNum2);
        v2.displayRegistrationDetails();
    }
}
