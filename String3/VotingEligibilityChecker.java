import java.util.Scanner;
import java.util.Random;

public class VotingEligibilityChecker {
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false (Invalid)";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayEligibilityTable(String[][] data) {
        System.out.printf("%-10s | %-10s\n", "Age", "Can Vote");
        System.out.println("------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s | %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] studentAges = generateRandomAges(n);

        String[][] votingResults = checkVotingEligibility(studentAges);

        System.out.println("\nVoting Eligibility Table:");
        displayEligibilityTable(votingResults);
    }
}
