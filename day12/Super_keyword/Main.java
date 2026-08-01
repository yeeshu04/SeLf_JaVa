package day12.super_keyword;

public class Main {
    static void main(String[] args) {

        person p = new person("Tom", "Riddle");
        student s = new student("Harry","potter",7.5);
        employee e = new employee("Rubeus", "Hagrid", 50000);

        p.show();
//        s.show();
//        System.out.println(s.gpa);
        s.showGPA();

        e.showSalary();

    }
}
