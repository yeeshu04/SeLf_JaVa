package day14.polymorphism;

public class main {
    static void main(String[] args) {

        car c = new car();
        bike b = new bike();
        boat bo = new boat();

        vehicle[] vehicles = {c,b,bo};

        for (vehicle v : vehicles) {
            v.go();
        }

//        c.go();
//        b.go();
//        bo.go();

    }
}
