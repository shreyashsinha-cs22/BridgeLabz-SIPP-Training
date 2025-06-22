import java.util.Scanner;

public class ManualTrim {

    public static int getLength(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for (char c : ch) {
            count++;
        }
        return count;
    }
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = getLength(str) - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (getLength(a) != getLength(b)) return false;
        for (int i = 0; i < getLength(a); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        int[] trimIndexes = findTrimIndexes(input);
        int start = trimIndexes[0];
        int end = trimIndexes[1];
        String manuallyTrimmed = manualSubstring(input, start, end);
        String builtinTrimmed = input.trim();

        boolean same = compareStrings(manuallyTrimmed, builtinTrimmed);

        System.out.println("\n--- Result ---");
        System.out.println("Original Input        : '" + input + "'");
        System.out.println("Manually Trimmed Text : '" + manuallyTrimmed + "'");
        System.out.println("Built-in Trimmed Text : '" + builtinTrimmed + "'");
        System.out.println("Are both equal?       : " + same);
    }
}
