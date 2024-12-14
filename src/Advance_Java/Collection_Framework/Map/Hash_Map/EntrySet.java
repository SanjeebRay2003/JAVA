package Advance_Java.Collection_Framework.Map.Hash_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("in","India");
        map.put("jp","Japan");
        map.put("en","England");
        map.put("am","America");

//        System.out.println(map);

        Set<Map.Entry<String,String>> entry = map.entrySet(); // It store the data in the form of entries in a set
        for (Map.Entry<String,String> entries:entry){
            System.out.println(entries.getKey()+ ",  "+entries.getValue());
        }
    }
}

/* getKey()  gives keys
    getValue() gives values
 */