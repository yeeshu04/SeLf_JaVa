import java.util.*;

public class ifstatement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.println("What is your name? ");
        name = sc.nextLine();

        System.out.println("What is your age? ");
        age = sc.nextInt();

        System.out.println("Are you a student (true/false): ");
        isStudent = sc.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("Please enter your name");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        //GROUP 2
        if(age>=65){
            System.out.println("You are senior! ");
        }
        else if(age >=18){
            System.out.println("You are an adult");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You are baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        //GROUP 3

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        sc.close();
    }
}
