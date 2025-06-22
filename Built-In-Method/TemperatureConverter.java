import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double inputTemp, convertedTemp;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = celsiusToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = fahrenheitToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
