package day15.runtime_polymorphism;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        //animal class is abstract class so we can't create an object

        Scanner sc = new Scanner(System.in);

        animal animal;
        //animal animal = new dog();
        System.out.print("would you like a dog or a cat (1 = dog, 2 = cat)? : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new cat();
            animal.speak();
        }
        sc.close();
    }
}
