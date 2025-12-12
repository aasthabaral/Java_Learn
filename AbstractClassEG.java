abstract class Figure {
    protected double dim1;
    protected double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double getArea();
}

class Rectangle1 extends Figure {
    public Rectangle1(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    public double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

public class AbstractClassEG {
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1(10, 5);
        Triangle tri = new Triangle(8, 6);

        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Triangle: " + tri.getArea());

        // Print name and symbol/ID
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");
    }
}
