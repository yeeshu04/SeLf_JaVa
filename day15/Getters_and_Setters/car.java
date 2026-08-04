package day15.getters_and_setters;

public class car {
    //declaring these attributes is add this access modifier of private preceding data type
    //if we don,t want an attribute to be writable when we declare it,
    //we can also add , a final keyword that add an extra security measure
    private  final String model;
    private String color;
    private int price;

    car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getmodel() {
        return this.model;
    }
    String getcolor() {
        return this.color;
    }
    String getprice() {
        return "$" + this.price;
    }

    void setcolor(String color) {
        this.color = color;
    }
    void setprice(int price) {
        if(price < 0){
            System.out.println("Price cannot be zero or negative");
        }
        else{
            this.price = price;
        }
    }

}
