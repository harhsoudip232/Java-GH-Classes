import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}