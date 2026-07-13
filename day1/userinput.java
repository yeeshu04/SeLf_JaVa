import java.util.*;
public class userinput {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter adjective 1(description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter noun1(animal/person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter adjective2(desciption): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter verb1 ending with -ing (action)");
        verb1 = scanner.nextLine();
        System.out.println("Enter adjective3(desciption): ");
        adjective3 = scanner.nextLine();


        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I sae a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}
