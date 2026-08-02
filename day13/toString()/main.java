package day13.toString_method;

public class main {
    static void main(String[] args) {

        car c = new car("Ford","mustang",2025, "red");
        car c1 = new car("F","m",2025, "r");


        System.out.println(c);
        System.out.println(c1);

//        System.out.println(c.color + " " + c.year + " " + c.make + " " + c.model);
    }
}
