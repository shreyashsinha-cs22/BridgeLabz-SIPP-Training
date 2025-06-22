import java.util.Scanner;
class NumberCheck {

    // Method to check number
    static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check the number
        int result = checkNumber(number);

        // Display the result
        if (result == -1) {
            System.out.println("The number is Negative.");
        } else if (result == 1) {
            System.out.println("The number is Positive.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
