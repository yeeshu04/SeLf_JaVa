import java.util.Scanner;

public class Compound_Interest_Calculator {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("enter the principle amount: ");
        principal = sc.nextDouble();

        System.out.print("enter the interest rate (in %): ");
        rate = sc.nextDouble();

        System.out.print("enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("enter the years: ");
        years = sc.nextInt();

        //calculation

        amount = principal * Math.pow(1 + rate / timesCompounded , timesCompounded * years);
        System.out.printf("the amount after %d years is %.2f", years, amount);

        sc.close();

    }
}
