import java.util.Scanner;
public class FactorialRecursive {
    public static void main(String[] args) {
        int number = getInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            System.exit(1);
        }
        return num;
    }
    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }
    // Method to display the result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
