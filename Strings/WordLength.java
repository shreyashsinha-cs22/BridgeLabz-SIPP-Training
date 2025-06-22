import java.util.Scanner;

public class WordLength {

    // Method to calculate length without using .length()
    public static int getLength(String str) {
        int i = 0;
        while (true) {
            // Use a sentinel approach: terminate when out of range
            if (isCharAvailable(str, i)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }
    public static boolean isCharAvailable(String str, int index) {
        return index < str.toCharArray().length; 
    }

    public static String[] splitIntoWords(String text) {
        int len = getLength(text);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder();
                for (int j = wordStart; j < i; j++) {
                    word.append(text.charAt(j));
                }
                words[wordIndex++] = word.toString();
                wordStart = i + 1;
            }
        }

        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengthMap = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthMap[i][0] = words[i];
            wordLengthMap[i][1] = String.valueOf(getLength(words[i]));
        }

        return wordLengthMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordLengthArray = getWordsWithLengths(words);

        System.out.printf("%-15s | %s\n", "Word", "Length");
        System.out.println("------------------------");
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]); // convert string to integer
            System.out.printf("%-15s | %d\n", word, length);
        }
    }
}
