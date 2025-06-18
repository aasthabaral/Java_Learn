import java.util.Scanner;
enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
public class EnumSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any of 4 seasons :");
        String input = scanner.nextLine().toUpperCase();
        try {
            Season currentSeason = Season.valueOf(input);
            if (currentSeason == Season.SPRING) {
                System.out.println("Flowers are blooming. It's Spring!");
            } else if (currentSeason == Season.SUMMER) {
                System.out.println("It's hot outside. Welcome to Summer!");
            } else if (currentSeason == Season.AUTUMN) {
                System.out.println("Leaves are falling. It's Autumn!");
            } else if (currentSeason == Season.WINTER) {
                System.out.println("It's cold outside. Winter is here!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input! Please enter one of: Spring, Summer, Autumn, Winter.");
        }

        scanner.close();
    }
}
