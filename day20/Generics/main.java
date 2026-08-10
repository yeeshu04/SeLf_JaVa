package day19.Generics;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class main {
    static void main(String[] args) {

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");

        Box<String> box = new Box<>();
        Box<Integer> box1 = new Box<>();

        box.setItem("Banana");
        box1.setItem(10);

        Product<String, Double> product = new Product<>("apple", 0.50);
        Product<String, Integer> product1 = new Product<>("ticket", 80);

        System.out.println(box.getItem());
        System.out.println(box1.getItem());

        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
    }
}
