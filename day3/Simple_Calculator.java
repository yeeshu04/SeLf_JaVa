import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;


        System.out.print("Please enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Please enter an operator(+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.print("Please enter the second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operation!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }


        sc.close();

    }
}