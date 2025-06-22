import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse date
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);

        // Output result
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Final date after all operations: " + finalDate.format(formatter));

        scanner.close();
    }
}
