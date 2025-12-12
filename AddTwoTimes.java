class Time {
    int hr, min, sec;
    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public Time add(Time t) {
        int newSec = this.sec + t.sec;
        int newMin = this.min + t.min + newSec / 60;
        int newHr = this.hr + t.hr + newMin / 60;
        newSec = newSec % 60;
        newMin = newMin % 60;
        return new Time(newHr, newMin, newSec);
    }
    public void display() {
        System.out.println(hr + " hr " + min + " min " + sec + " sec");
    }
}
public class AddTwoTimes {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 30, 20);
        Time sum = t1.add(t2);
        System.out.print("First Time: ");
        t1.display();
        System.out.print("Second Time: ");
        t2.display();
        System.out.print("Sum of Time: ");
        sum.display();
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");}
    }

