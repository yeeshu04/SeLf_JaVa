package day14.polymorphism;
//public class bike extends vehicle
public class bike implements vehicle {

    @Override
    public void go() {
        System.out.println("You drive the bike");
    }

}
