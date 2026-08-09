package day18.Anonymous;

public class main {
    static void main(String[] args) {

        dog dog = new dog();
        talkingdog dog1 = new talkingdog();

        //anonymous class
        dog dog2 = new dog(){
            @Override
            public void speak(){
                System.out.println("Scooby doo says *Ruh Roh");
            }
        };


        dog.speak();
        dog1.speak();
        dog2.speak();


    }
}
