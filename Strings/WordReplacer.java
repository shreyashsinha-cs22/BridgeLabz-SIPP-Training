import java.util.Scanner;

public class WordReplacer {
    // Custom method to replace a word in the sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        // \\b ensures only whole words are replaced
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Call the method
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Output
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
