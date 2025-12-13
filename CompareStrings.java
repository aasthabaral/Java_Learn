import java.util.Scanner;
public class CompareStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("The strings are exactly equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are equal ignoring case.");
        } else {
            System.out.println("The strings are not equal even ignoring case.");
        }
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("The strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("First string is less than second string lexicographically.");
        } else {
            System.out.println("First string is greater than second string lexicographically.");
        }
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");
        sc.close();
    }
}
