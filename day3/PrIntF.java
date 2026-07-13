public class PrIntF {
    static void main() {
        //%specifier-character
        String name = "Yeeshu";
        char firstletter = name.charAt(0);
        int age = 20;
        double height = 11.1;
        boolean isEmployed = true;

        //%flags and [.precision]

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;
        double price4 = 678923.15;

        //[width]
        int id1 =1;
        int id2 =23;
        int id3 =456;
        int id4 =7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);



        //%flags and [.precision]

        System.out.printf("\n%+.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.3f\n", price3);
        System.out.printf("% .4f\n", price4);

        //%specifier-character

        System.out.printf("\nHello %s\n", name);
        System.out.printf("your name start with a %c\n", firstletter);
        System.out.printf("your age is %d years old\n", age);
        System.out.printf("your height is %f inches tall\n", height);
        System.out.printf("isEmployed is %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);


    }

}
