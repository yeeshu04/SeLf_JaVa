package day12.super_keyword;

public class employee extends person{

    int salary;

    employee(String first,String last,int salary){

        super(first,last);
        this.salary=salary;


    }
    void showSalary(){
        System.out.println(this.first + " salary is: " + this.salary);
    }
}
