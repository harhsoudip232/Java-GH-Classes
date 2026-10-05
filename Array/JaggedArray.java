import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        // Taking size of each row
        for (int i = 0; i < rows; i++) {

            System.out.print(
                "Enter number of elements in row " + i + ": "
            );

            int columns = sc.nextInt();

            arr[i] = new int[columns];
        }

        // Taking elements
        for (int i = 0; i < rows; i++) {

            System.out.println("Enter elements of row " + i + ":");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Traversing Jagged Array
        System.out.println("\nJagged Array:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}