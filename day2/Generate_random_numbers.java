import java.util.Random;
public class Generate_random_numbers {
    static void main() {

        Random random = new Random();
        int number1;
        double number2;
        boolean number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextDouble(1, 101);
        number3 = random.nextBoolean();
        System.out.println("The random number is: " + number1);
        System.out.println("The random number is: " + number2);
        if(number3) {
            System.out.println("Head");
        }else{
            System.out.println("Tail");
        }
    }
}
