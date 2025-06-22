import java.util.Scanner;
public class NumberChecker {
    // Method to check if number is positive
    static boolean isPositive(int number) {
        return number > 0;
    }
    // Method to check if number is even or odd
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // Method to compare two numbers
    static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5 ];
        // Take 5 numbers as input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        // Check positivity and even/odd
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else {
                System.out.println(numbers[i] + " is Negative.");
            }
        }
        // Compare first and last number
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);

        if (comparison == 0) {
            System.out.println("First and last number are Equal.");
        } else if (comparison == 1) {
            System.out.println("First number is Greater than last number.");
        } else {
            System.out.println("Last number is Greater than first number.");
        }
    }
}
