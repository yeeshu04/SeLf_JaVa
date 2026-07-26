package day7;

import java.util.Scanner;

public class Search_array {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int[] numbers = {1,9,2,8,3,5,4};
        String[] fruits = {"apple","orange","lemon","grape","banana"};
        boolean isFound = false;
        String target;

        System.out.print("enter a fruits to search for: ");
        target=sc.nextLine();
//        String target="grape";
//        int target = 4;

//        for(int i=0;i<numbers.length;i++){
//            if(target == numbers[i]){
//                System.out.println("element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }


        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("element not found");
        }

        sc.close();

    }
}
