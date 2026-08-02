package day13.interfaces;

public class main {
    public static void main(String[] args) {

        rabbit r = new rabbit();
        hawk hawk = new hawk();
        fish fish = new fish();


        r.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();

    }
}
