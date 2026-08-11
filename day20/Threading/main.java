package day20.Threading;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println("you have 5 seconds to enter your name");


        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);



        sc.close();
    }
}
