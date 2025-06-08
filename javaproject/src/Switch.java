import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Traffic Light
        System.out.print("Enter a traffic light color (red, yellow, or green): ");
        String lightColor = scanner.nextLine().toLowerCase();

        switch (lightColor) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Ready to go.");
            case "green" -> System.out.println("Go");
            default -> System.out.println("Invalid color.");
        }

        // Task 2: Calculator
        double num1, num2, outcome = 0;
        char operator;
        boolean isValid = true;

        System.out.print("Enter a number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %, ^): ");
        operator = scanner.next().charAt(0);  // reads first character

        System.out.print("Enter another number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> outcome = num1 + num2;
            case '-' -> outcome = num1 - num2;
            case '*' -> outcome = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Can't divide by 0.");
                    isValid = false;
                } else {
                    outcome = num1 / num2;
                }
            }
            case '%' -> {
                if (num2 == 0) {
                    System.out.println("Can't divide by 0.");
                    isValid = false;
                } else {
                    outcome = num1 % num2;
                }
            }
            case '^' -> outcome = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator entered!");
                isValid = false;
            }
        }

        if (isValid) {
            System.out.println("Result: " + outcome);
        }

        scanner.close();
    }
}
