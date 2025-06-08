import java.util.Random;
import java.util.Scanner;

public class RSPgame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String myChoice;
        String systemChoice;
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            System.out.print("Enter your move (rock, paper, scissors): ");
            myChoice = scanner.nextLine().toLowerCase();

            if (myChoice.equals("rock") || myChoice.equals("paper") || myChoice.equals("scissors")) {
                systemChoice = choices[random.nextInt(3)];
                System.out.println("System choice: " + systemChoice);

                if (myChoice.equals(systemChoice)) {
                    System.out.println("It's a tie!");
                } else if (
                        (myChoice.equals("rock") && systemChoice.equals("scissors")) ||
                                (myChoice.equals("paper") && systemChoice.equals("rock")) ||
                                (myChoice.equals("scissors") && systemChoice.equals("paper"))
                ) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }

                System.out.print("Play again (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();
            } else {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            }
        }

        scanner.close();
    }
}
