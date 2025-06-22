import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take first date input
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput);

        // Take second date input
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput);

        // Compare dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }

        
    }
}
