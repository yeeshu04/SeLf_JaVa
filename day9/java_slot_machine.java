package day9;

import java.util.Random;
import java.util.Scanner;

public class java_slot_machine {

    static void main(String[] args) {

        //Declare variables
        Scanner sc=new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //Display welcome message
        System.out.println("Welcome to java slot");
        System.out.println("Symbols: 🫡 🤨 😐 😑 😶‍🌫️");

        //Play if balance > 0
        while(balance>0){

            //Enter Bet amount

            System.out.println("Current balance $: "+balance);
            System.out.print("Place your bet amount: ");
            bet=sc.nextInt();
            sc.nextLine();


            // Verify if bet > balance

            if(bet>balance){
                System.out.println("Insufficient balance");
                continue;
            }

            //Verify if bet > 0

            else if(bet<=0){
                System.out.println("Bet amount can't be negative");
                continue;
            }
                // Subtract bet from balance

                balance -= bet;



            //Spin row
            System.out.println("Spinning...");
            //method
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout>0){
                System.out.println("Your won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("You lost");
            }

            //ask to play again

            System.out.println("Do you want to play again? (Y/N): ");
            playAgain = sc.nextLine().toLowerCase();

            if(playAgain.equals("n")){
                break;
            }
        }


        // Display exit message

        System.out.println("Game over! Your final balance is $"+balance);

        sc.close();

    }
    //spinrow() method
    static String[] spinRow(){

        String[] symbols = {"🫡","🤨","😐","😑","😶‍🌫️"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0;i<3;i++){
            row[i]= symbols[random.nextInt(symbols.length)];
        }

        return  row;
    }

    //print row

    static void printRow(String[] row) {
        System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
    }

    //get payout

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            //enhanced switch
            return switch(row[0]){
                case "🫡" -> bet * 3;
                case "🤨" -> bet * 4;
                case "😐" -> bet * 5;
                case "😑" -> bet * 10;
                case "😶‍🌫️" -> bet * 20;
                default -> 0;
            };
        }

        else if(row[0].equals(row[1])){
            //enhanced switch
            return switch(row[0]){
                case "🫡" -> bet * 2;
                case "🤨" -> bet * 3;
                case "😐" -> bet * 4;
                case "😑" -> bet * 5;
                case "😶‍🌫️" -> bet * 10;
                default -> 0;
            };
        }

        else if(row[1].equals(row[2])){
            //enhanced switch
            return switch(row[1]){
                case "🫡" -> bet * 2;
                case "🤨" -> bet * 3;
                case "😐" -> bet * 4;
                case "😑" -> bet * 5;
                case "😶‍🌫️" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }

}
