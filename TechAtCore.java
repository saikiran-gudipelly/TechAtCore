import java.util.*;

public class TechAtCore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialization of array
        int arr[] = new int[10];

        // Initializing the values into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Formatting
        System.out.println();
        System.out.println("Displaying the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Formatting
        System.out.println();
        System.out.println();

        // Reversing the array
        System.out.println("Reversed elements in the array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // Formatting
        System.out.println();
        System.out.println();

        // Duplicate elements in the array
        System.out.println("Duplicate elements in the array:");
        boolean foundDuplicate = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    foundDuplicate = true;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found");
        }

        // Formatting
        System.out.println();

        // Missing numbers in the array
        System.out.println("Missing numbers in the array:");

        for (int i = 1; i <= 10; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(i);
            }
        }

        // Closing the scanner
        sc.close();
    }
}
