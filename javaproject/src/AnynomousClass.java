public class AnynomousClass {
    public static void main(String[] args) {
        Greeting greet1 = new Greeting();
 // Anonymous subclass
        Greeting greet2 = new Greeting() {
                @Override
                void sayHello() {
                    System.out.println(" Konnichiwa, ogenki desu ka?");     //Japanese greeting: "Hello, how are you?"
                }
            };
            greet1.sayHello();
            greet2.sayHello();
        }
    }
    class Greeting {
        void sayHello() {
            System.out.println("Hello! how are you?");
        }
    }


