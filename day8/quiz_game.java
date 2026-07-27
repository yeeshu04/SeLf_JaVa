package day8;

import java.util.Scanner;

public class quiz_game {
    static void main(String[] args) {

        //Question array[]

        String[] questions = {"What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computer?",
                "What was the first programming language?"};

        //Option array[][]

        String[][] options = {{"1. Storing files", "2. Ecrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU" ,"2. Hard Drive" , "3. RAM", "4. GPU"},
                              {"1. 200" ,"2. 2004" , "3. 2006", "4. 2008"},
                              {"1. Steve jobs" ,"2. Bill gates" , "3. Alan turing", "4. Charles Babbage"},
                              {"1. COBOL" ,"2. C" , "3. Fortran", "4. Assembly"}};

        //Declare variables

        int[] answer = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        //Welcome message

        System.out.println("Welcome to the java Quiz Game");

        //  Question (loop)

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for(String option : options[i]) {
                System.out.println(option);
            }
            //  Option
            //  Get Guess From User
            System.out.print("enter your guess: ");
            guess = sc.nextInt();

            //Check Our guess
            if(guess == answer[i]) {
                System.out.println("Congratulations! You guessed correctly!");
                score++;
            }
            else {
                System.out.println("Wrong guess! Try again!");
            }
        }

        //Display Final score

        System.out.println("The score is " + score + " out of " + questions.length);


        sc.close();
    }
}
