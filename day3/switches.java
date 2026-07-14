import java.util.Scanner;

public class switches {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a week: ");
        String day = sc.nextLine();

        switch (day) {
//            case "Monday" -> System.out.println("It is a weekday");
//            case "Tuesday" -> System.out.println("It is a weekday");
//            case "Wednesday" -> System.out.println("It is a weekday");
//            case "Thursday" -> System.out.println("It is a weekday");
//            case "Friday" -> System.out.println("It is a weekday");
//            case "Saturday" -> System.out.println("It is a weekday");
//            case "Sunday" -> System.out.println("It is a weekday");

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is weekday");
            case "Saturday", "Sunday" -> System.out.println("It is weekend");
            default -> System.out.println("It is not a day");
        }

    }
}
