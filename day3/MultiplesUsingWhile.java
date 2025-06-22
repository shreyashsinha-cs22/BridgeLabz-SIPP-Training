import java.util.Scanner;
public class MultiplesUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0 || number >= 100)
            System.out.println("Invalid input. Please enter a positive integer less than 100.");
        else{
           System.out.println("Multiples of " + number + " below 100:");
           int counter = 99;	
           while (counter > 0){
               if (counter % number == 0)
               System.out.println(counter);
               counter--;
            }
        }
    }
}
