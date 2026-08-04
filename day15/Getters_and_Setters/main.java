package day15.getters_and_setters;

public class main {
    static void main(String[] args) {

        car c = new car("Charger", "Yellow",10000);

        //setters
        c.setcolor("Blue");
        c.setprice(-10);

        //c.model = "Corvette";

        //getter
        System.out.println(c.getcolor() + " " + c.getmodel() + " " + c.getprice());

    }
}
