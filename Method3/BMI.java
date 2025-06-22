import java.util.Scanner;
public class BMI {
    // Method to calculate BMI
    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    // Method to determine BMI category
    static void printBMICategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal.");
        } else if (bmi >= 25 && bmi < 40) {
            System.out.println("Overweight.");
        } else {
            System.out.println("Obese.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height (m): ");
        double height = sc.nextDouble();
        double bmi = calculateBMI(weight, height);
        System.out.println("BMI = " + bmi);
        printBMICategory(bmi);
    }
}
