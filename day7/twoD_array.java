package day7;

public class twoD_array {
    public static void main(String[] args) {

//        String[] fruits = {"apple", "orange", "grape"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork","beef","fish"};

//        String[][] groceries = {fruits, vegetables, meats};

        String[][] groceries = {{"apple", "orange", "grape"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork","beef","fish"}};

        //replacement
        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][1] = "egg";


        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
