class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }
    public double getVolume() {
        return width * height * depth;
    }
}
public class BoxVolumeAndArea {
    public static void main(String[] args) {
        Box box = new Box(5, 4, 3);
        System.out.println("Surface Area of Box: " + box.getArea());
        System.out.println("Volume of Box: " + box.getVolume());
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");
    

            }
}
