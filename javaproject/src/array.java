
    import java.util.Scanner;
    public class array {
    public static void main(String[] args) {
            //Array Declaration
            String[] menu = {"Start Game", "Load Game", "Settings", "Exit"};
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Menu ");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.println("You chose: " + menu[choice - 1]);
            } else {
                System.out.println("Invalid choice.");
            }

            scanner.close();
        }
    }


