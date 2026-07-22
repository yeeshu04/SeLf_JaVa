package day5;

import java.util.Scanner;

public class Simple_Banking {

    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        // Declare variables


        double balance = 0;
        boolean isRunning = true;
        int choice;

        //Display Menu

        while (isRunning) {
            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            //Get and process users choice

            System.out.print("enter your choice(1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        //ShowBalance()

        //deposit

        //withdraw()

        //Exit message

        System.out.println("Thank you for using our Banking");

        sc.close();

    }

    //ShowBalance() newmethod
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    //deposit
    static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposit: ");
        amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        } else {

            return amount;
        }
    }

    //withdraw()
    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter an amount to be withdraw: ");
        amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient amount");
            return 0;
        } else if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;

        } else {
            return amount;
        }
    }

}



