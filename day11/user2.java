package day11;

public class user2 {

    String username;
    String email;
    int age;

    //constructor that accepts no argument

    user2(){
        this.username="Guest";
        this.email="Not provided";
        this.age=0;
    }
    //

    user2(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    //method overloading= mathods with same name but different paramters

    user2(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    user2(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
