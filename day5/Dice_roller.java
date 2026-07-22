package day5;

import java.util.Random;
import java.util.Scanner;

public class Dice_roller {

    static void main(String[] args) {

        //Declare variable

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;


        // Get # of Dice From the user

        System.out.print("Please enter the number of dice you want to roll:");
        numOfDice = sc.nextInt();

        // Check if # of Dice > 0

        if (numOfDice > 0) {

            //Roll all the dice
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);

                //get the total
                total += roll;
            }
            System.out.println("Total: " + total);

        }
        else {
            System.out.println("# of dice must be greator than 0");
        }


        sc.close();

    }
    //Declare ascii of dice
    static void printDie(int roll) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("# of dice must be greator than 0");
        }

    }


}
