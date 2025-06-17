class UnitConvertor2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        double yards = 5;
        double feet = 15;
        double meters = 2;
        double inches = 10;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters.");
