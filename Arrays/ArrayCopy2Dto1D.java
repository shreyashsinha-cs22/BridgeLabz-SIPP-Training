import java.util.Scanner;

public class ArrayCopy2Dto1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns]; // 2D array creation

        // Step 1: Input elements of the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 2: Create 1D array of size rows * columns
        int[] array = new int[rows * columns];

        // Step 3: Copy elements from 2D to 1D
        int index = 0;
        for (int i = 0; i < rows; i++) {         // Outer loop for rows
            for (int j = 0; j < columns; j++) {  // Inner loop for columns
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 2D array
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display the 1D array
        System.out.println("\n1D Array (Copied from 2D):");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
