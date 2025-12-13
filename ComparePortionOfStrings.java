import java.util.Scanner;
public class ComparePortionOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter starting index in first string: ");
        int start1 = sc.nextInt();
        System.out.print("Enter starting index in second string: ");
        int start2 = sc.nextInt();
        System.out.print("Enter number of characters to compare: ");
        int length = sc.nextInt();
        boolean result = str1.regionMatches(start1, str2, start2, length);
        if (result) {
            System.out.println("The specified portions of the strings are equal.");
        } else {
            System.out.println("The specified portions of the strings are not equal.");
        }
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");

        sc.close();
    }
}


