package day16.composition;

public class engine {

    String type;

    //constructor engine()
    engine(String type) {
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + "engine");
    }

}
