package day12.super_keyword;

import day10.Student;

public class student extends person{

    double gpa;

    student(String first, String last, double gpa){

        //super keyword refers to parent

        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + " gpa is: " + this.gpa);
    }
}
