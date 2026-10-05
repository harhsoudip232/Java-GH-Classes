// INTERFACE
interface Transaction {

    void deposit(double amount);

    void withdraw(double amount);
}


// ABSTRACT CLASS
abstract class BankAccount implements Transaction {

    // ENCAPSULATION
    private String accountHolder;
    private double balance;

    // CONSTRUCTOR
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Abstract method
    abstract void accountType();

    public void displayAccount() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}


// INHERITANCE
class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    // METHOD OVERRIDING → POLYMORPHISM
    @Override
    void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}


// INHERITANCE
class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    // METHOD OVERRIDING → POLYMORPHISM
    @Override
    void accountType() {
        System.out.println("Account Type: Current Account");
    }
}


// MAIN CLASS
public class BankSystem {

    public static void main(String[] args) {

        // Constructor
        SavingsAccount savings =
                new SavingsAccount("Rahul", 5000);

        savings.displayAccount();
        savings.accountType();

        savings.deposit(2000);
        savings.withdraw(1000);

        System.out.println("Final Balance: ₹"
                           + savings.getBalance());


        System.out.println();


        // POLYMORPHISM
        BankAccount account =
                new CurrentAccount("Priya", 10000);

        account.displayAccount();
        account.accountType();

        account.deposit(3000);
        account.withdraw(2000);

        System.out.println("Final Balance: ₹"
                           + account.getBalance());
    }
}