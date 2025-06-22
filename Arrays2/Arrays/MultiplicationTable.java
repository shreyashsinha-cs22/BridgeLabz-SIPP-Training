import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
         Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the results (size 10 for 1 to 10)
        int[] table = new int[10];

        // Calculate multiplication results and store in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

    }
}
