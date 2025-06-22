import java.util.Scanner;

class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; 

        result[0] = number / divisor;
        result[1] = number % divisor;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter first number: ");
        int number = sc.nextInt();

        System.out.print("Enter Second number (divisor): ");
        int divisor = sc.nextInt();

        // Calculate quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        int quotient = result[0];
        int remainder = result[1 ];

        // Display the results
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
