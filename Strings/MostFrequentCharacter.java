import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); // Optional: make it case-insensitive

        int[] freq = new int[256];
        int maxFreq = 0;
        char mostFrequentChar = ' ';

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequentChar = ch;
            }
        }
        System.out.println("Most frequent character: '" + mostFrequentChar + "' occurred " + maxFreq + " times.");
    }
}
