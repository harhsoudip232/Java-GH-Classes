import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            sum = sum + digit;

            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
