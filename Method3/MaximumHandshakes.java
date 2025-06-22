import java.util.Scanner;

class MaximumHandshakes {

    // Method to calculate maximum number of handshakes
    static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("Maximum number of handshakes = " + maxHandshakes);
    }
}
