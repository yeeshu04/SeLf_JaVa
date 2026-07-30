package day11;

public class user1 {
    static void main(String[] args) {

        user2 u1 = new user2("Yeeshu");
        user2 u2 = new user2("Eshu", "eshu@aa.com");
        user2 u3 = new user2("Ishu","Ishu@al.com", 20);

        //BY creating an object & passing in no arguments we can setup some default value
        user2 u4 = new user2();

        System.out.println(u4.username);
        System.out.println(u4.email);
        System.out.println(u4.age);

        System.out.println(u1.username);
        System.out.println(u1.email);
        System.out.println(u1.age);

        System.out.println(u2.username);
        System.out.println(u2.email);
        System.out.println(u2.age);

        System.out.println(u3.username);
        System.out.println(u3.email);
        System.out.println(u3.age);
    }
}
