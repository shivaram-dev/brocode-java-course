import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Main {
    public static void main(String[] args) {

        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        // Only displays one number and stops
        // timer.schedule(task, 0); 

        timer.scheduleAtFixedRate(task, 0, 1000);

        scanner.close();
    }
}
