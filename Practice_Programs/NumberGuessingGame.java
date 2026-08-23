import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 50;
        int guess;

        System.out.println("Guess the number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the number.");
                break;
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}