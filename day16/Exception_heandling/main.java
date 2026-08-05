package day16.Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch (InputMismatchException e) {
            System.out.println("That is not a number.");
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }

        //Exception = catching all exception act as safety net

        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        //finally is used for cleaning up program
        finally {

            //we don,t need sc.close() when scanner object is in try{}
//            sc.close();
        }

    }
}
