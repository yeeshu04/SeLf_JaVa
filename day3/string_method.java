import java.util.Locale;

public class string_method {
    static void main(String[] args) {

        String name = "  Yeeshu code  ";

        int length = name.length();
        char letter = name.charAt(3);
        int index = name.indexOf("c");
        int lastIndex = name.lastIndexOf("e");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("e", "a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());

        if(name.contains(" ")){
            System.out.println("name contains space");
        }
        else {
            System.out.println("name is empty");
        }

        if (name.equals("password")) {
            System.out.println("your name can't be password");
        }
        else  {
            System.out.println("Hello" + name);
        }

    }
}
