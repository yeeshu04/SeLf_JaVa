import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_game {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int min =1;
        int max =100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing game");
        System.out.printf("Enter your guess between %d to %d\n", min , max);

        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attemps++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high! Try again");
            }
            else {
                System.out.println("Correct! Try again" + randomNumber );
                System.out.println("You guessed " + attemps + " out of " + guess + " attempts");
            }


        }while (guess != randomNumber);


        System.out.println("You won the game!");

        sc.close();
    }
}
