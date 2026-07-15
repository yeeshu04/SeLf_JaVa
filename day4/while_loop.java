import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {


        //GROUP 1 infinite loop
//        Scanner sc = new Scanner(System.in);
//
//        String name = "";
//
//
//        while(name.isEmpty()){
//            System.out.print("Please enter your name: ");
//            name = sc.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//
//
//
//        sc.close();



        //GROUP 2 game

//        Scanner sc = new Scanner(System.in);
//
//        String response ="";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("press Q to quit: ");
//            response = sc.next().toUpperCase();
//        }
//
//        System.out.println("You have quit the game ");




        //GROUP 3  While loop

//        Scanner sc = new Scanner(System.in);
//
//        int age = 0;
//
//        System.out.print("Enter your age ");
//        age = sc.nextInt();
//
//        while (age < 0) {
//            System.out.println("Invalid age");
//            System.out.print("Enter your age");
//            age = sc.nextInt();
//        }


//        do {
//            System.out.println("Invalid age");
//            System.out.print("Enter your age");
//            age = sc.nextInt();
//        } while (age < 0);


//        System.out.println("You are " + age + " years old");
//
//
//
//        sc.close();




        //GROUP 4  do-while loop


        Scanner sc = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Please enter a number between 1 and 10: ");
            number = sc.nextInt();

        } while (number < 1 || number > 10);

        System.out.println("you picked " + number);




        sc.close();
    }
}