package day13.Method_Overriding;
//child class of animal
public class fish extends animal{


    //annotation of a @override
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }

}
