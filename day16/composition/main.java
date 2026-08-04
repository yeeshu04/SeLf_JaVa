package day16.composition;

public class main {
    static void main(String[] args) {

        //now we contruct car object
        car car = new car("Corvette", 2025, "V8 ");

        System.out.println(car.model);
        System.out.println(car.year);
        //for type of engine we will acccess engine object then get type
        //following engine object we will use access modifier that dot then access type
        System.out.println(car.engine.type);

        car.start();
    }
}
