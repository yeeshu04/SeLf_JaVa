package day9;

public class CAR_OOps_1 {

    static void main(String[] args) {

        CAR_OOps_2 car = new CAR_OOps_2();
        CAR_OOps_2 car2 = new CAR_OOps_2();

        //same attributes
        System.out.println(car2.make + " " + car2.model);
        System.out.println(car.make + " " + car.model);



        car.isRunning = true;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);


        car.drive();
        car.brake();


    }

}
