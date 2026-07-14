public class ternary_operator {
    static void main(String[] args) {

        int score = 70;
        int hours = 13;
        int income = 30000;

//        if(score >= 60) {
//            System.out.println("pass");
//        }
//        else {
//            System.out.println("fail");
//        }

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        String evenOrOdd = (score % 2 == 0) ? "EVEN" : "ODD";

        String timeOrDay = (hours < 12) ? "A.M." : "P.M.";

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOrDay);
        System.out.print(taxRate);
    }
}
