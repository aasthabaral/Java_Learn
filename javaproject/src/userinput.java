import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Created to get input from user

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read string with spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read integer

        System.out.println("Hello i am " + name + ". I am " + age + ".");

        scanner.close(); // we need to close the scanner
    }
}
