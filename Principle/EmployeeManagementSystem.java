import java.util.*;

// Interface: Department
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class: Employee
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setEmployeeId(int id) { this.employeeId = id; }
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double salary) { this.baseSalary = salary; }

    // Department methods
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for employee #" + i);
            System.out.print("Employee Type (1 for Full-Time, 2 for Part-Time): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Base Salary: ₹");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            if (type == 1) {
                System.out.print("Bonus: ₹");
                double bonus = scanner.nextDouble();
                scanner.nextLine();

                FullTimeEmployee fte = new FullTimeEmployee(id, name, baseSalary, bonus);
                fte.assignDepartment(department);
                employees.add(fte);
            } else if (type == 2) {
                System.out.print("Hours Worked: ");
                int hours = scanner.nextInt();

                System.out.print("Hourly Rate: ₹");
                double rate = scanner.nextDouble();
                scanner.nextLine();

                PartTimeEmployee pte = new PartTimeEmployee(id, name, baseSalary, hours, rate);
                pte.assignDepartment(department);
                employees.add(pte);
            } else {
                System.out.println("Invalid employee type. Skipping this entry.");
            }
        }

        // Display all employee details
        System.out.println("\n========= All Employees =========");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
}
