import java.util.Scanner;

public class for_loop {
    static void main(String[] args) throws InterruptedException {


            //Group 1
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter how many time you want to loop: ");
//        int maxTime = sc.nextInt();
//
//        for (int i = 1; i <= maxTime; i++) {
//            System.out.println(i);
//        }
//        sc.close();


        //Group 2

        System.out.print("How many seconds to countdown from?: ");
        int startTime = sc.nextInt();

        for (int i=startTime; i>0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year");


    }
}
