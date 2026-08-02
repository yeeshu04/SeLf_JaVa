package day13.abstraction;

//we can't create shape objects it's an abstract class
public abstract class shape {

    // abstract method
    abstract double area();

    //concrete methods are defined & inherit within an abstract class

    //concrete method
    void display() {
        System.out.println("this is a shape");
    }

}
