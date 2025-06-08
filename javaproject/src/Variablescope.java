public class Variablescope {
    //  Class variables ( instance variables)
        String name;
        int rollNumber;
        Variablescope(String studentName, int studentRoll) {
            name = studentName;         // local variables
            rollNumber = studentRoll;
        }
        void displayInfo() {
            //  class variables
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
        }
    void displayInfo(int rollNumber) {
            System.out.println("Roll Number: " + rollNumber);
    }
        void calculatePercentage(int marks1, int marks2, int marks3) {
            //  Local variables
            int total = marks1 + marks2 + marks3;
            double percentage = total / 3.0;

            System.out.println("Percentage: " + percentage + "%");
        }
        public static void main(String[] args) {
            Variablescope s1 = new Variablescope("Aastha", 101);
            s1.displayInfo();
            s1.displayInfo(404);
            s1.calculatePercentage(80, 90, 85);
        }
    }


