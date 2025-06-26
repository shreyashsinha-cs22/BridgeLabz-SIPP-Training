import java.util.*;

class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Solutions Pvt. Ltd.";
    static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final String id; // Final: cannot be changed after assignment
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("\nTotal Employees: " + totalEmployees);
    }

    // Method to display employee details with instanceof check
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Company     : " + companyName);
            System.out.println("Name        : " + name);
            System.out.println("Employee ID : " + id);
            System.out.println("Designation : " + designation);
        } else {
            System.out.println("Invalid Employee Object.");
        }
    }
}

class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First employee
        System.out.print("Enter employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter employee ID: ");
        String id1 = sc.nextLine();

        System.out.print("Enter designation: ");
        String desig1 = sc.nextLine();

        Employee emp1 = new Employee(name1, id1, desig1);
        emp1.displayEmployeeDetails();
        Employee.displayTotalEmployees();

        // Second employee
        System.out.print("\nEnter another employee name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter employee ID: ");
        String id2 = sc.nextLine();

        System.out.print("Enter designation: ");
        String desig2 = sc.nextLine();

        Employee emp2 = new Employee(name2, id2, desig2);
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();

        sc.close();
    }
}
