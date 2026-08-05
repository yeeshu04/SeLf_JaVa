package day16.wrapper;

import java.lang.classfile.instruction.CharacterRange;

public class main {
    static void main(String[] args) {

        //we can treat 123 as an object by using wrapper class
        //int a = 123;

        //wrapper class
        //objects - a,b,c,d

//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);


        //the modern way to use wrapper classes to assign them directly to
        //their promotive values

        // Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;

//        String e = "Pizza";

        //Unboxing
        //set it equal to integer object(a)
        //we were taking primitive that wrappped in an object & unboxing it
        //or unwrapping it & setting it back to its primitive
//        int x = a;
//        double y = b;
//        char z = c;
//        boolean e = d;

        //If we need to convert primitive dataType into a String
        //there is two String method() of these utility classes

        //toString method() to convert integer to String

//        String a = Integer.toString(123);
//        String b = Double.toString(3.24);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        String x = a + b + c + d;
//        System.out.println(x);

        //parse method() String to inteeger

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c= "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");
//
//
//        String x = a + b + c + d;
//        System.out.println(x);

        char letter = 'b';

        // for checking letter is actually letter
        //we use wrapper class .isLetter for boolean true or false

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
