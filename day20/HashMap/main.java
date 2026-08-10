package day20.hashmaps;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;

public class main {

    static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("Banana", 1.0);
        map.put("orange", 1.56);
        map.put("apple", 1.24);

        map.remove("orange");

        System.out.println(map);
        //System.out.println(map.get("apple"));

        System.out.println(map.containsKey("orange"));

        if(map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found");
        }
        System.out.println(map.containsValue(1.0));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

    }

}
