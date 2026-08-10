package day20.Enums;

import java.util.Locale;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a days of the week:");
        String response = sc.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THRUSDAY,
                     FRIDAY -> System.out.println("It's a weekday!");
                case SATURDAY, SUNDAY -> System.out.println("It's a weekend");

            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}
