package day11.car;

public class car1 {
    static void main(String[] args) {

//        Car c1 = new Car("BMW", "red");
//        Car c2 = new Car("BMW", "Blue");
//        Car c3 = new Car("BMW", "Yellow");

//        Car[] cars = {c1, c2, c3};


        //WITHIN IN ARRAY we can create anonymous objects

        Car[] cars = {new Car("BMW", "red"),
                new Car("BMW", "green"),
                new Car("BMW", "blue")};

//        for (int i = 0; i < cars.length; i++) {
//            cars[i].drive();

//        }
            //advance for loop
        for (Car car : cars) {
            //change car color using enhanced for loop

            car.color = "black";

        }
        for(Car car : cars){
            car.drive();
        }

    }
}
