package day12.static_keyword;

public class friend {
    static void main(String[] args) {

        friend1 f1 = new friend1("Yeeshu");
        friend1 f2 = new friend1("ishu");
        friend1 f3 = new friend1("shu");
        friend1 f4 = new friend1("eshu");
        friend1 f5 = new friend1("Sandy");

        //to access a static member by the name of the
        //class itself rather than any object

        System.out.println(friend1.numOfFriends);
//        System.out.println(f2.numOfFriends);
//        System.out.println(f3.numOfFriends);



        friend1.showfriends();

//      Math.round(3.99);

    }
}
