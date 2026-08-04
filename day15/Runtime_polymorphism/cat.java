package day15.runtime_polymorphism;

public class cat extends animal {
    @Override
    void speak() {
        System.out.println("meow");
    }
}
