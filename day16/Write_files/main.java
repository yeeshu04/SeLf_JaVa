package day16.Write_files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    static void main(String[] args) {

        String filePath = "C:\\3166\\Intellij-idea\\Bro code\\src\\day16\\Write_files\\test.txt";
//        String textContent = "I like pizaa!\nIt's really good!\nBuy me pizza!";

        String textContent = """
                Roses are red
                Violets are Blue
                Booty 
                Rockin' Everywhere!
                """;


        //file location from window and file name test.txt
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        }

        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }

        catch (IOException e){
            System.out.println("Could not write file");
        }

    }
}
