import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Respond with: 'low', 'high', or 'correct'.");

        while (!guessedCorrectly && lowerBound <= upperBound) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is it " + guess + "?");

            String feedback = getUserFeedback(scanner);

            switch (feedback.toLowerCase()) {
                case "low":
                    lowerBound = guess + 1;
                    break;
                case "high":
                    upperBound = guess - 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number!");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, something went wrong. Are you sure you gave correct feedback?");
        }

        scanner.close();
    }

    // Generates a random guess within the given range
    public static int generateGuess(int lower, int upper) {
        Random rand = new Random();
        return rand.nextInt(upper - lower + 1) + lower;
    }

    // Gets feedback from the user
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Enter your feedback (low/high/correct): ");
        return scanner.nextLine().trim();
    }
}
