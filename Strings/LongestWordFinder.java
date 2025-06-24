import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words using space
        String[] words = sentence.split(" ");

        String longestWord = "";
        
        // Find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output
        System.out.println("Longest word: " + longestWord);
    }
}
