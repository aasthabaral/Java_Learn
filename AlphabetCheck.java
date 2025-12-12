import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read first character

        // Check if character is alphabet
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        scanner.close();
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");
    }
    }

