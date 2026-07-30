package day9;

public class CAR_OOps_2 {

    String make = "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 50000.99;
    boolean isRunning = false;

    void start() {
        isRunning = false;
        System.out.println("You start the engine");
    }
    void stop() {
        isRunning = true;
        System.out.println("You stop the engine");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }
    void brake() {
        System.out.println("You brake the " + model);
    }
}
