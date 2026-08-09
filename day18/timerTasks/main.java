package day18.timertasks;

import java.util.Timer;
import java.util.TimerTask;

public class main {
    static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 3;


            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    System.out.println("Task completed");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 1000, 1000);

    }
}
