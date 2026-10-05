import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        

        //found = falsse then not found or !found  = true
        //found = true then not found or !found  = false
        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}