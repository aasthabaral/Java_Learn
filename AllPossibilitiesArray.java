import java.util.Scanner;

public class AllPossibilitiesArray {

    // Method to check if array contains all numbers from 0 to length-1
    public static int isAllPossibilities(int[] arr) {
        int n = arr.length;
        boolean[] found = new boolean[n]; // Track which numbers are found

        for (int num : arr) {
            if (num < 0 || num >= n) {
                return 0; 
            }
            found[num] = true; }

        // Check if all numbers from 0 to n-1 are present
        for (boolean b : found) {
            if (!b) return 0;
        }

        return 1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = isAllPossibilities(arr);
        if (result == 1) {
            System.out.println("The array is an array of all possibilities.");
        } else {
            System.out.println("The array is NOT an array of all possibilities.");
        }

        scanner.close();
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");
    }
}
