package day14.polymorphism;
//public class car extends vehicle
public class car implements vehicle {

    @Override
    public void go() {
        System.out.println("You drive the car");
    }
}
