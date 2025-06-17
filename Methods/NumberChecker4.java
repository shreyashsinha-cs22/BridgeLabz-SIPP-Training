import java.util.Scanner;

public class NumberChecker4 {

    // Check if a number is prime
    static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Check if a number is neon
    static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Check if a number is spy
    static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Check if a number is automorphic
    static boolean isAutomorphic(int number) {
        int square = number * number;
        String numberStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numberStr);
    }

    // Check if a number is a buzz number
    static boolean isBuzz(int number) {
        return number % 7 == 0 || Integer.toString(number).endsWith("7");

    }

    // Main Method with User Input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(number + " is prime? " + isPrime(number));

        System.out.println(number + " is neon? " + isNeon(number));

        System.out.println(number + " is spy? " + isSpy(number));

        System.out.println(number + " is automorphic? " + isAutomorphic(number));

        System.out.println(number + " is buzz? " + isBuzz(number));

    }
}
