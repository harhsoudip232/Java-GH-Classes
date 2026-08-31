package OOPS;

class BankAccount {

    // Private data → cannot be accessed directly from outside
    private double balance;

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Display balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankExample {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(1500);
        account.showBalance();
    }
}
