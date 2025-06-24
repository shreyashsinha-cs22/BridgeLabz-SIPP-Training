import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                areEqual = false;
                if (ch1 < ch2) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
                } else {
                    System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
                }
                break;
            }
        }

        if (areEqual) {
            if (str1.length() == str2.length()) {
                System.out.println("Both strings are equal.");
            } else if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
            } else {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
            }
        }
    }
}
