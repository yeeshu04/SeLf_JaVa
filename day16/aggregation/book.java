package day16.aggregation;

public class book {

    String title;
    int page;

    book(String title, int page) {
        this.title = title;
        this.page = page;
    }

    String displayInfo(){
        // (" + this.page + ") we have made a book for object
        //we enclose the no of pages within a set of parentheses
        //we can also use printf statement
        return this.title + " (" + this.page + " pages)";
    }
}
