public class UnitConvertor3 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    // Main method to demonstrate functionality
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 18.933;
        System.out.println(fahrenheit + " Fahrenheit = " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius = " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " Pounds = " + convertPoundsToKilograms(pounds) + " Kilograms.");
        System.out.println(kilograms + " Kilograms = " + convertKilogramsToPounds(kilograms) + " Pounds.");
        System.out.println(gallons + " Gallons = " + convertGallonsToLiters(gallons) + " Liters.");
        System.out.println(liters + " Liters = " + convertLitersToGallons(liters) + " Gallons.");
    }
}
