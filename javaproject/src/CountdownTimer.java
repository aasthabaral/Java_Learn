import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int countdownSeconds = 5;

        TimerTask task = new TimerTask() {
            int secondsLeft = countdownSeconds;

            @Override
            public void run() {
                if (secondsLeft > 0) {
                    System.out.println("Time left: " + secondsLeft + " seconds");
                    secondsLeft--;
                } else {
                    System.out.println("Time's up! You missed your move.");
                    timer.cancel(); // stop the timer
                }
            }
        };

        timer.schedule(task, 0, 1000);  // Start immediately, repeat every 1 second (1000 milliseconds)
    }
}
