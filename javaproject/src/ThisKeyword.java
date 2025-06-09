class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Parameterized constructor
    public Time(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    // Method to add two Time objects
    public void add(Time t1, Time t2) {
        this.seconds = t1.seconds + t2.seconds;
        this.minutes = t1.minutes + t2.minutes + this.seconds / 60;
        this.seconds = this.seconds % 60;
        this.hours = t1.hours + t2.hours + this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    // Method to display time
    public void display() {
        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }
}

public class ThisKeyword{
    public static void main(String[] args) {
        Time t1 = new Time(1, 40, 30);
        Time t2 = new Time(1, 20, 50);
        Time t3 = new Time();

        t3.add(t1, t2);

        System.out.println("Time t1:");
        t1.display();
        System.out.println("Time t2:");
        t2.display();
        System.out.println("Sum time t3:");
        t3.display();
    }
}
