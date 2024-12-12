package Advance_Java.Collection_Framework.Map.Hash_Map;

import java.util.*;

public class KeySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("in","India");
        map.put("jp","Japan");
        map.put("en","England");
        map.put("am","America");

        System.out.println(map);

        System.out.println(map.keySet());

        Set<String> keySet = map.keySet();
//        Collection<String> keyCollection = map.keySet(); // it is also used
        System.out.println("Set or Collection of Keys : "+keySet); // it converts the existing keys into set

        Collection<String> values = map.values(); // it gives the collection of values
//        Set<String> values = map.values();// we cant convert values int Set because values ar not unique
        System.out.println("Collection of values : "+values);


        // here we use keys as arrayList
        ArrayList<String> ListMap = new ArrayList<>(map.keySet()); // it converts the keySet into ArrayList
        ListMap.remove(2);
        System.out.println(ListMap.contains("jp"));
        ListMap.add("SriLanka");
        System.out.println(ListMap);


    }
}

/* Keys can be Set or Collection both because Set have only unique value and collection have both unique or not unique
    but values can not be a Set because Set are unique but values can be or not be unique value
 */
