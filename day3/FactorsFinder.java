import java.util.*;
class FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) 
            System.out.println("Invalid input. Please enter a positive integer.");
          else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
    }
}
