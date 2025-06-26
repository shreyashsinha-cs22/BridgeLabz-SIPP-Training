import java.util.*;
class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;
    private String accountHolderName;
    private final String accountNumber;
    private double balance;
    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("\nTotal Bank Accounts Created: " + totalAccounts);
    }
    // Method to display account details using instanceof check
    public void displayAccountInfo() {
        if (this instanceof BankAccount) {
            System.out.println("\n--- Account Information ---");
            System.out.println("Bank Name      : " + bankName);
            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Balance        : ₹" + balance);
        } else {
            System.out.println("Invalid object.");
        }
    }
}

class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount account1 = new BankAccount(name, accNum, balance);
        account1.displayAccountInfo();
        BankAccount.getTotalAccounts();
    }
}
