import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {
        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);

        displayResults(a, b, gcd, lcm);
    }

    // Method to get user input
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        scanner.close();
        return new int[] { a, b };
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    // Method to calculate LCM using GCD
    public static int findLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }

    // Method to display results
    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
