package day19.CountDown;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class timer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = sc.nextInt();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Happy new year!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);//(task,delay,period)

        sc.close();
    }
}
