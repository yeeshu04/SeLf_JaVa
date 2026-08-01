package day12.super_keyword;

public class person {

    String first;
    String last;

    person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void show(){
        System.out.println(this.first +  " " + this.last);

    }
}
