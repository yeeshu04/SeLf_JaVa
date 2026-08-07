package day17.music_player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        //How to play Audio with java(.wav, .au, .aiff)

        String filePath = "C:\\3166\\Intellij-idea\\Bro code\\src\\day17\\music_player\\Country Music - Hugh Mitchel.wav";
        //we have to pass in our filepath as an argument to create a file object
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {


            //Clip is like sound player it allows to load audio file
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            //clip.start();
            //we create a prompt to play stop reset or quit

            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = sc.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    //When the clip begins playing the next time, it will start at this position
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }

            }

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio line not available");
        }

        catch (UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio File");
        }

        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Bye!");

        }

    }
}
