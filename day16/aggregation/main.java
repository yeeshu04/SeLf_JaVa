package day16.aggregation;

public class main {
    static void main(String[] args) {

        book b1 = new book("The fellow of the Ring", 423);
        book b2 = new book("The Two Towers", 352);
        book b3 = new book("The Return of the king", 416);

        book[] books = {b1,b2,b3};

//        System.out.println(b1.displayInfo());
//        System.out.println(b2.displayInfo());
//        System.out.println(b3.displayInfo());

        //enhanced for loop
//        for (book b : books) {
//            System.out.println(b.displayInfo());
//        }

        //Library object
        library library = new library("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
