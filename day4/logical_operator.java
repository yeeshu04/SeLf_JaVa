import java.util.Scanner;

public class logical_operator {
    static void main(String[] args) {

//        double temp = 35;
//        boolean isSunny = true;
//
//        if (temp <= 30 && temp >= 0 && isSunny ) {
//            System.out.println("The weather is good");
//            System.out.println("It is Sunny outside");
//        }
//        else if (temp <= 30 && temp >= 0 && !isSunny ) {
//            System.out.println("The weather is good");
//            System.out.println("It is Cloudy outside");
//        }
//        else if (temp > 30 || temp < 0) {
//            System.out.println("The weather is bad");
//        }

        Scanner sc = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String username;

        System.out.print("Enter your name: ");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("username must be between 4 and 12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("username cannot contain spaces or underscores");
        } else {
            System.out.println("Welcome " + username);
        }


        sc.close();
    }
}
