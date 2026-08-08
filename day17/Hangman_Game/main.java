package day17.Hangman_game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
    static void main(String[] args) {


        String filePath = "C:\\3166\\Intellij-idea\\Bro code\\src\\day17\\Hangman_game\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }

        Random random = new Random();

        String word =words.get(random.nextInt(words.size()));

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }



        System.out.println("Welcome to the Hangman Game!");

        while(wrongGuess < 6){

            System.out.println(getHangmanArt(wrongGuess));

            System.out.println("Word: ");

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            //.next() will return string so we have to use .charAt()
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("You guessed it!");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')){
                    System.out.print(getHangmanArt(wrongGuess));
                    System.out.println("You win");
                    System.out.println("The word is: " + word);
                    break;
                }

            }else {
                wrongGuess++;
                System.out.println("Wrong guess!");
            }
        }

        if(wrongGuess >= 6){
            System.out.print(getHangmanArt(wrongGuess));
            System.out.println("Game over!");
            System.out.println("The word was: " + word);
        }

        sc.close();
    }
    static String getHangmanArt(int wrongGuess) {

        return switch (wrongGuess){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                       o
                    
                    
                    """;
            case 2 -> """
                       o
                       |
                   
                    """;
            case 3 -> """
                       o
                      /|
                    
                   """;
            case 4 -> """
                       o
                      /|\\
                    
                    """;
            case 5 -> """
                       o
                      /|\\
                      /
                    """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                    
                    """;
            default -> "";
        };

    }
}
