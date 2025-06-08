import java.util.Random;
import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String phoneNo;
        System.out.print("Enter your phone number: ");
        phoneNo = scanner.nextLine();

        if (phoneNo.length() == 10 ) {
            int otp = random.nextInt(9000) + 1000; // Always generates 4-digit from 1000 to 9999
            System.out.println("Your OTP is: " + otp);
        } else {
            System.out.println("Enter a valid 10-digit phone number.");
        }
        scanner.close();
    }
}
