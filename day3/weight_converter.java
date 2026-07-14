import java.util.Scanner;

public class weight_converter {
    static void main(String[] args) {

        //weight converter program

        //Declare variables
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight converstion program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. convert kgs to lbs");

        System.out.print("choose an option: ");
        choice = sc.nextInt();

        //option 1 convert lbs to kgs

        if(choice == 1) {
            System.out.print("Please enter the lbs weight: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new kgs weight is %.2f", newWeight);
        }

        //option 2 convert kgs to lbs

        else if(choice == 2) {
            System.out.print("Please enter the kgs weight: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new lbs weight is %.2f", newWeight);
        }

        //else print not a valid choice

        else  {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
