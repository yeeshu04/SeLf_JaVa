package day16.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    static void main(String[] args) {


        // <> diamond operator , this has to deal with generics
        //we can use appropriate wrapper class to store primitive like
        //ArrayList<Integer> list = new ArrayList<>();

//        ArrayList<Integer> list = new ArrayList();
//        ArrayList<Double> list1 = new ArrayList();
//        ArrayList<String> fruits = new ArrayList();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list1.add(2.44);
//        list1.add(3.44);
//
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("cherry");
//        fruits.add("lemon");
//
//        System.out.println(list);
//        System.out.println(list1);
//
//        //fruits.remove(3);
//        //fruits.set(3, "Pineapple");
//        System.out.println(fruits);
//        System.out.println(fruits.get(0));
//        System.out.println(fruits.size());
//
//        //for sort the arraylist we will use the (Collection) framework
//
//        Collections.sort(fruits);
//        System.out.println(fruits);
//
//        //enhanced for loop
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        Scanner sc=new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("enter the # of the food you would like: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i +": ");
            String food = sc.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        sc.close();
    }
}
