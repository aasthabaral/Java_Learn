import java.util.Scanner;

public class converter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("1. USD to NPR");
        System.out.println("2. USD to EUR");
        System.out.println("3. NPR to EUR");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("1 USD = 133.5 NPR");
        } else if (choice == 2) {
            System.out.println("1 USD = 0.93 EUR");
        } else if (choice == 3) {
            System.out.println("1 NPR = 0.00697 EUR");
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
