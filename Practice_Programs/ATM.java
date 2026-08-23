import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Money deposited successfully.");
                        System.out.println("New Balance = ₹" + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }

                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money.");
                        System.out.println("Remaining Balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }

                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");

            }

        } while (choice != 4);

        sc.close();
    }
}