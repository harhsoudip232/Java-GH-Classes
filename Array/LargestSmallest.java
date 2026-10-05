import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest)
                largest = arr[i];

            if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}