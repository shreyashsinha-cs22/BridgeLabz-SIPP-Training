import java.util.Scanner;
public class NumberStorage {
    public static void main(String[] args) {
        double[] numbers = new double[10]; 
        double total = 0.0;                
        int index = 0;                   
        Scanner sc = new Scanner(System.in);
        // Infinite loop to take input
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double input = sc.nextDouble();
            //Check for 0 or negative input
            if (input <= 0) {
                break;
            }
			
            // Check if array limit reached
            if (index == 10) {
                System.out.println("Maximum of 10 values reached.");
                break;
            }
            // Store the number and increment index
            numbers[index] = input;
            index++;
        }
        // Sum all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        // Display results
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Total sum of numbers: " + total);
    }
}
