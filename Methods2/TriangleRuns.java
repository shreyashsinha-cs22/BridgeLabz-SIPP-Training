import java.util.Scanner;
class TriangleRuns {
    // Method to compute number of rounds to complete 5km run
    static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for the 3 sides of the triangle
        System.out.print("Enter side 1 (in m): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 (in m): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 (in m): ");
        double side3 = sc.nextDouble();
        // Calculate number of rounds
        double rounds = computeRounds(side1, side2, side3);
        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds of the park to reach 5km.");
    }
}
