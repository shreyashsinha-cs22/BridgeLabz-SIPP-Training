import java.util.Random;

public class ZaraEmployeeBonus {

    // Generate salaries and years of service
    static int[][] generateEmployeeData(int numberOfEmployees) {
        int[][] data = new int[numberOfEmployees][2]; // [salary, service]
        Random rand = new Random();

        for (int i = 0; i < numberOfEmployees; i++) {
            // 5-digits salary (10000-99999)
            data[i][0] = rand.nextInt(90000) + 10000;

            // years of service (0-10)
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }

    // Calculate new salaries and bonuses
    static double[][] calculateBonuses(int[][] employeeData) {
        int numberOfEmployees = employeeData.length;
        double[][] newData = new double[numberOfEmployees][2]; // [newSalary, bonus]

        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = employeeData[i][0];
            int service = employeeData[i][1];
            double bonusRate = service > 5 ? 0.05 : 0.02;

            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Calculate sum and display in tabular format
    static void calculateSums(int[][] employeeData, double[][] newEmployeeData) {
        int numberOfEmployees = employeeData.length;

        int sumOldSalary = 0;
        double sumNewSalary = 0;
        double sumBonus = 0;

        System.out.println("Employee | Old Salary | Years of Service |  Bonus |  New Salary");

        for (int i = 0; i < numberOfEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int service = employeeData[i][1];
            double bonus = newEmployeeData[i][1];
            double newSalary = newEmployeeData[i][0 ];

            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            sumBonus += bonus;

            System.out.format("%-10d | %-12d | %-18d | %-8.2f | %-12.2f%n",
                    (i + 1), oldSalary, service, bonus, newSalary);
        }

        System.out.println("\nTotal Old Salary = " + sumOldSalary);
        System.out.println("Total New Salary = " + sumNewSalary);
        System.out.println("Total Bonus Amount = " + sumBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        int[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] newEmployeeData = calculateBonuses(employeeData);
        calculateSums(employeeData, newEmployeeData);
    }
}
