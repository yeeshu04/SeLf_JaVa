package day12.Inheritance;

//child class of animal

//To inherit all the attributes & methods from another class
//after the class name we use extends keyword then specify the parent class
public class cat extends animal1 {

    int lives = 9;

    void speak() {
        System.out.println("The cat goes meow");
    }

}
