import java.util.Scanner;

public class Methods {
    public static void main(String[] args){

        String name = "YEESHU";
        int age = 20;

        happyBirthday(name, age);
        double result = square(3);
        System.out.println(square(3));
        System.out.println(cube(3));
        String FullName = getFullName("apple", "mango");
        System.out.println(FullName);

        int ag = 21;

        if(ageCheck(ag)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up");
        }
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday");
        System.out.printf("Happy Birthday to you %s", name);
        System.out.println("\nHappy Birthday dear");
        System.out.printf("You are %d years old!\n", age);
    }



    static double square(double number){
        return number*number;
    }
    static double cube(double number1){
        return number1*number1*number1;
    }
    static String getFullName(String first, String last){
        return first + " "  + last;
    }

    static boolean ageCheck(int ag){
        if(ag>=18){
            return true;
        }
        else {
            return false;
        }
    }

}
