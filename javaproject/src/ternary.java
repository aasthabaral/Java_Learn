import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        age= scanner.nextInt();
        /*if(age >= 18){
            System.out.println("Enter");
        }
            else{
            System.out.println("You are a minor.You can't enter.");
        }*/

        //Ternary operator:returns 1 0f 2 values if a condition is true
        //variable=(condition)? ifTrue:ifFalse
        String  isVerified=(age>=18)? "You are logged in.":"You cant enter. ";
        System.out.println(isVerified);
        scanner.close();}
}
