package day10;

public class Student {

    String name ;
    int age ;
    double gpa;
    boolean isEnrolled;

    //each object with unique name by the help of constructor
    // matching set of argument should be there any parameter setup
    Student(String name, int age, double gpa) {
        //for assign attributes(name,age,gpa) we use this keyword
        //this. refers to the object currently working with
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
        //void method
    void study(){
        System.out.println(this.name + " is studying");
    }

}
