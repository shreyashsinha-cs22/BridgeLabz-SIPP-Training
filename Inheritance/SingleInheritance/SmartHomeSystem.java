import java.util.Scanner;

class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter device ID: ");
        String deviceId = scanner.nextLine();

        System.out.print("Enter device status (ON/OFF): ");
        String status = scanner.nextLine();

        System.out.print("Enter temperature setting (°C): ");
        double temp = scanner.nextDouble();
        Thermostat thermostat = new Thermostat(deviceId, status, temp);

        System.out.println("\n--- Device Status ---");
        thermostat.displayStatus();

        scanner.close();
    }
}
