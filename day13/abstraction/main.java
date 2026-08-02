package day13.abstraction;

public class main {
    static void main(String[] args) {


        //we can't create shape object because it is abstract class
        circle c = new circle(3);
        triangle t = new triangle(4,5);
        rectangle r = new rectangle(6,7);

        c.display();
        t.display();
        r.display();

        System.out.println("Area of circle is: " + c.area());
        System.out.println("Area of triangle is: " + t.area());
        System.out.println("Area of rectangle is: " + r.area());

    }
}
