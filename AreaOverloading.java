import java.util.Scanner;

public class AreaOverloading {
 public static double area(double side) {
        return side * side;
    }
    public static double area(double length, double width) {
        return length * width;
    }
    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        System.out.println("Area of square: " + area(side));

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle: " + area(length, width));

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: " + areaCircle(radius));
        scanner.close();
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");}
    
    }

