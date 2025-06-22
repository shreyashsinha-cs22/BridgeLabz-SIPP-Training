import java.util.*;
public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int i = 1;
            while (i <= number) {
                if (number % i == 0)
                    System.out.println(i);
                
                i++;
            }
        }
    }
}
