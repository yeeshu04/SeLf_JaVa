package day16.aggregation;

public class library {

    String name;
    int year;
    book[] books;

    library(String name, int year, book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Avaible: ");
        for (book book : books){
            System.out.println(book.displayInfo());
            //book.displayInfo();  this method return string
        }
    }

}
