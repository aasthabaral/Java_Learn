import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class exceptionHandling {
    public static void main(String[] args) {

        //SimpleATM
        Scanner scanner=new Scanner(System.in);
        int balance=4000;
        int withdrawAmount ;
        System.out.println("Your Balance Amount is:" + balance);
        System.out.println("Enter the amount you want to withdraw:");
        withdrawAmount= scanner.nextInt();
        try {
            if (withdrawAmount > balance) {
                throw new Exception("Insufficient balance!");
            }
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Transaction complete.");

       //FileWriter object used to write FILES with java

        try {
            FileWriter writer = new FileWriter("output.txt");  // Create a FileWriter object to write to a file  "output.txt"
            writer.write("Hello, this is a test.\n");  // Write text to the file
            writer.write("Writing to a file in Java is easy!");
            writer.close();    //  Close the writer

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}


