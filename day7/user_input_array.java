package day7;

import java.util.Scanner;

public class user_input_array {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] food;
        int size;

        System.out.print("what # of food do you want?: ");
        size=sc.nextInt();

        food=new String[size];
        sc.nextLine();

//        String[] food = new String[3];

//        food[0] = "pizza";
//        food[1] = "tea";
//        food[2] = "apple";

        for(int i=0;i<food.length;i++){
            System.out.print("enter food number: ");
            food[i]=sc.nextLine();
        }

        for (String foods : food) {
            System.out.println(foods);
        }

        sc.close();
    }

}

