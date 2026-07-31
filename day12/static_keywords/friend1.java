package day12.static_keyword;

public class friend1 {

    static int numOfFriends;
    String name;

    friend1(String name) {
        this.name = name;
        numOfFriends++;
    }
    static void showfriends(){

        //for numOfFriends we don't need this. object
        //because it becomes a static keyword
        System.out.println("You have " + numOfFriends + " total friends");
    }

}
