import java.util.Scanner;

public class VowelConsonantCounter {
    public static String getCharType(char ch) {
        int ascii = (int) ch;
        if (ascii >= 65 && ascii <= 90) {
            ch = (char)(ascii + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = getCharType(ch);

            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(input);

        System.out.println("\n--- Result ---");
        System.out.println("Vowels     : " + counts[0]);
        System.out.println("Consonants : " + counts[1]);
    }
}
