import java.util.Scanner;
public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");

        int max = findMaximum(num1, num2, num3);
        displayResult(max);
    }
    // Method to get an integer input from the user
    public static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    // Method to display the result
    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }
}
