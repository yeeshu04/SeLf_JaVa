package day20.Alarm_Clock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final File filePath;
    private final Scanner sc;

    AlarmClock(LocalTime alarmTime, File filePath, Scanner sc) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.sc = sc;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
//                int hours = now.getHour();
//                int minutes = now.getMinute();
//                int seconds = now.getSecond();


                System.out.printf("\r%02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("\nAlarm *Noises*");
        playSound();
    }

    private void playSound() {

        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(filePath)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Press *Enter* to stop the alarm: ");
            sc.nextLine();
            clip.stop();
            sc.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File Not Supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio Not Available");
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}