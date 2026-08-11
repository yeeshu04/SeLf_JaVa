package day20.Alarm_Clock;

import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alaramTime = null;
        File filePath = new File("C:\\3166\\Intellij-idea\\Bro code\\src\\day20\\Alarm_Clock\\Country Music - Hugh Mitchel.wav");

        while(alaramTime == null){
            try {
                System.out.print("Enter an alaram time(HH:MM:SS): ");
                String inputTime = sc.nextLine();

                alaramTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alaramTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid time format. please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alaramTime, filePath, sc);
        Thread alarmthread = new Thread(alarmClock);
        alarmthread.start();



    }
}
