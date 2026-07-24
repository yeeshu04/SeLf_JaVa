package day6;

import java.util.Arrays;

public class array {

    static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "kiwi"};
        //fruit[0] = "pineapple"
        //int numOfFruits = fruits.length;

        Arrays.sort(fruits);
        Arrays.fill(fruits, fruits[0]); //"apple" instead of fruits[0] both work same

//        for(int  i=0;i<fruits.length;i++){
//            System.out.println(fruits[i]);
//        }
        //enhanced for loop

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
