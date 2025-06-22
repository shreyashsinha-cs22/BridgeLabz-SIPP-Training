import java.util.Scanner;

public class RandomNumbers {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // 4-digit number range: 1000-9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3]; // [average, minimum, maximum]

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / numbers.length;

        result[0] = average;
        result[1] = min;
        result[2] = max;

        return result;
    }

    public static void main(String[] args) {
        int size = 5;

        int[] numbers = generate4DigitRandomArray(size);

        System.out.print("Generated 4-digit numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(numbers);
        System.out.println("Average = " + results[0]);
        System.out.println("Min = " + (int)results[1]);
        System.out.println("Max = " + (int)results[2]);

    }
}
