package day13.interfaces;

public class fish implements prey,predator {

    @Override
    public void flee() {
        System.out.println("fish is swimming");
    }


    @Override
    public void hunt() {
        System.out.println("fish is hunting");
    }
}
