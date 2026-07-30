package day10;

public class Constructor_Student {
    static void main(String[] args) {


        Student s1 = new Student("Yeeshu", 30, 8.2);
        Student s2 = new Student("Ishu", 34,7.5);
        Student s3 = new Student("Eshu", 38, 7.0);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gpa);
        System.out.println(s1.isEnrolled);
        s1.study();

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gpa);
        System.out.println(s2.isEnrolled);
        s2.study();

        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.gpa);
        System.out.println(s3.isEnrolled);
        s3.study();

    }
}
