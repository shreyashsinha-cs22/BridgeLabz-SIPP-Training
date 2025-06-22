import java.util.*;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();	
        if (number <= 0 || number >= 100) 
            System.out.println("Invalid input. Please enter a positive integer less than 100.");
        else {
           System.out.println("Multiples of " + number + " below 100:");
           for (int i = 100; i >= 1; i--) {
               if (i % number == 0) 
                   System.out.println(i);
                
            }
        }

        
    }
}
