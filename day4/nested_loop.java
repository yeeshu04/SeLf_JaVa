import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {


//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j + " ");
//            }
//
//        }


        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }


        sc.close();

    }
}
