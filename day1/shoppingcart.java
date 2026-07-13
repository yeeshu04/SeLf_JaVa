import java.util.*;

public class shoppingcart {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("What price would you like to buy?: ");
        price = sc.nextDouble();

        System.out.print("What quantity would you like to buy?: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is $" + total);

        sc.close();
    }
}
