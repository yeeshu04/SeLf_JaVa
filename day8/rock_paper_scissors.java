package day8;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    static void main(String[] args) {

        //Declare Variable

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerchoice;
        String computerchoice;
        String playagain = "Yes";


        do {
            System.out.print("Welcome to the rock paper scissors! enter:");
            playerchoice = sc.nextLine().toLowerCase();

            //Get choice from the user

            if (!playerchoice.equals("rock") &&
                    !playerchoice.equals("paper") &&
                    !playerchoice.equals("scissors")) {
                System.out.println("Please enter a valid choice");
                continue;
            }

            // get random choice for the computer

            computerchoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerchoice);

            //check win conditions

            if(playerchoice.equals(computerchoice)) {
                System.out.println("It's a tie!");
            } else if ((playerchoice.equals("rock") && computerchoice.equals("scissors")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock")) ||
                    playerchoice.equals("scissors") && computerchoice.equals("paper")){
                System.out.println("You win!");
            }

            else {
                System.out.println("You lose!");
            }


            //ask to play again

            System.out.print("Play again (yes/no): ");
            playagain = sc.nextLine().toLowerCase();
        }while(playagain.equals("yes"));


        //goodby message

        System.out.println("Thanks for playing!");

        sc.close();
    }
}
