package day14.polymorphism;
//public class boat extends vehicle
public class boat implements vehicle {

    @Override
    public void go() {
        System.out.println("You drive the boat");
    }

}
