import java.util.Scanner;

public class math_exercises {
    public static void main(String[] args) {

        //GROUP 1

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//        result =Math.pow(2,5);
//        result =Math.abs(-5);
//        result =Math.sqrt(9);
//        result =Math.round(3.14);
//        result =Math.ceil(3.14);
//        result =Math.floor(3.14);
//        result =Math.max(10,20);
//        result =Math.min(10,20);
//
//        System.out.println("The result is: " + result);


        //GROUP 2

        // HYPOTENUSE c = Math.sqrt(a2 + b2)

//        Scanner sc = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.println("Enter the length of side A: ");
//        a=sc.nextDouble();
//
//        System.out.println("Enter the length of side B: ");
//        b=sc.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) +  Math.pow(b,2));
//        System.out.println("The square root of a is "+c + "cm");
//
//        sc.close();


        //GROUP 3

        //circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius,2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter radius ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) *Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm ", circumference);
        System.out.printf(" The area is: %.1fcm^2 ", area);
        System.out.printf(" The volume is: %.1fcm^3 ", volume);


        sc.close();

    }
}



