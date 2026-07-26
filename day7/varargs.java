package day7;

public class varargs {
    static void main(String[] args) {


//        System.out.println(add(1,2,3,4));
        System.out.println(average(1,2,3,4));

    }

    static double average(double... numbers) {

        double sum=0;

        if(numbers.length==0){
            return 0;
        }

        for(double num:numbers){
            sum+=num;
        }
        return sum/numbers.length;
    }
//    static int add(int... numbers){
//
//        int sum=0;
//        for(int num:numbers){
//            sum+=num;
//        }
//        return sum;
//    }
}
