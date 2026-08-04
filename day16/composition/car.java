package day16.composition;

public class car {

    String model;
    int year;
    engine engine;

    //we have pass the model,year object not engine
    car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        // call the constructor for a new engine object now we pass the engine type
        //when we pass argument our parameter names can be different from the argument
        //names that we pass in
        //but type refers to the engine type
        this.engine = new engine(engineType);

    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " engine has started");
    }

}
