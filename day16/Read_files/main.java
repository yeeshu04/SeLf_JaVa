package day16.Read_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {

        //BufferedReader + FileReader

        String filePath = "C:\\3166\\Intellij-idea\\Bro code\\src\\day16\\Read_files\\test.txt";


        //we can't create buffered reader object without first passing in a reader object - new FileReader()

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            //System.out.println("That file exists!");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }

    }
}
