import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class InvoiceDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();      // Get current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = now.format(formatter);
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        System.out.print("Enter quantity: ");

        int qty = scanner.nextInt();
        System.out.print("Enter price per item: ");

        double price = scanner.nextDouble();
        double total = qty * price;
        System.out.println("\n Invoice ");
        System.out.println("Date & Time: " + formattedDateTime);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per item: " + price);
        System.out.println("Total amount: " + total);
        scanner.close();
    }
}
