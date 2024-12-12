package Advance_Java.Collection_Framework.Map.Hash_Map;

import java.util.*;

public class hash_Map {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("in","India");
        map.put("jp","Japan");
        map.put("en","England");
        map.put("am","America");

        Map<String,String> map2 = new HashMap<>();
        map2.put("pk","Pakistan");
        map2.put("af","Afghanistan");
        map2.put("chi","China");



//        map.put("in","Indonasia"); // here "in" key is updated from India -> Indonasia
        map.putIfAbsent("sl","SriLanka"); // it add if the same key is not present in the data

        map.remove("am");
        System.out.println(map.containsKey("in"));
        System.out.println(map.containsValue("Japan"));

        System.out.println(map.get("in"));
        System.out.println(map.getOrDefault("eo","Others")); // if key is present then print its value otherwise print default value

        map.putAll(map2); // add the second hashMap map2 in map

        System.out.println(map);




    }
}


