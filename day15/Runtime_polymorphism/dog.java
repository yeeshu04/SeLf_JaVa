package day15.runtime_polymorphism;

public class dog extends animal{
    @Override
    void speak() {
        System.out.println("woof");
    }
}
