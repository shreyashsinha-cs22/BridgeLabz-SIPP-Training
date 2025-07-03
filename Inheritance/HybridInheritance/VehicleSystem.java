import java.util.Scanner;

// Interface for refuelable vehicles
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryPercentage;

    public ElectricVehicle(int maxSpeed, String model, int batteryPercentage) {
        super(maxSpeed, model);
        this.batteryPercentage = batteryPercentage;
    }

    public void charge() {
        System.out.println("Charging... Battery is now 100%");
        batteryPercentage = 100;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryPercentage + "%");
    }
}

// Subclass: PetrolVehicle implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelLevel;

    public PetrolVehicle(int maxSpeed, String model, int fuelLevel) {
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling... Tank is now full.");
        fuelLevel = 100;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Electric Vehicle
        System.out.println("Enter details for Electric Vehicle:");
        System.out.print("Model: ");
        String evModel = scanner.nextLine();
        System.out.print("Max Speed (km/h): ");
        int evSpeed = scanner.nextInt();
        System.out.print("Battery Percentage: ");
        int evBattery = scanner.nextInt();
        scanner.nextLine(); // consume newline

        ElectricVehicle ev = new ElectricVehicle(evSpeed, evModel, evBattery);

        // Input for Petrol Vehicle
        System.out.println("\nEnter details for Petrol Vehicle:");
        System.out.print("Model: ");
        String pvModel = scanner.nextLine();
        System.out.print("Max Speed (km/h): ");
        int pvSpeed = scanner.nextInt();
        System.out.print("Fuel Level (%): ");
        int pvFuel = scanner.nextInt();

        PetrolVehicle pv = new PetrolVehicle(pvSpeed, pvModel, pvFuel);

        // Display and update Electric Vehicle
        System.out.println("\n--- Electric Vehicle Info ---");
        ev.displayInfo();
        ev.charge();
        ev.displayInfo();

        // Display and update Petrol Vehicle
        System.out.println("\n--- Petrol Vehicle Info ---");
        pv.displayInfo();
        pv.refuel();
        pv.displayInfo();

        scanner.close();
    }
}
