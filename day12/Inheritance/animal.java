package day12.Inheritance;

public class animal {
    static void main(String[] args) {

        dog d = new dog();
        cat c = new cat();

        System.out.println(d.isAlive);
        System.out.println(c.isAlive);

        d.eat();
        c.eat();

        System.out.println(d.lives);
        System.out.println(c.lives);

        d.speak();
        c.speak();

        plant p = new plant();
        System.out.println(p.isAlive);

        p.photosynthesis();

    }
}
