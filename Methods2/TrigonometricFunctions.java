import java.util.Scanner;
class TrigonometricFunctions {
    // Method to calculate trigometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        double radians = Math.toRadians(angle);
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigometric functions
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine(" + angle + ") = " + trigValues[0]);
        System.out.println("Cosine(" + angle + ") = " + trigValues[1]);
        System.out.println("Tangent(" + angle + ") = " + trigValues[2]);

        sc.close();
    }
}
