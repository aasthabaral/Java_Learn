public class ArrayOutOfBound{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("numbers[0] = " + numbers[0]);
            System.out.println("numbers[4] = " + numbers[4]);
            System.out.println("numbers[5] = " + numbers[5]); // Index out of bounds

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Name:Prasikshya \n Symbol:28391/078");
    }}
