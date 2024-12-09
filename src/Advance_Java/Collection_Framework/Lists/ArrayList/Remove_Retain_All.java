package Advance_Java.Collection_Framework.Lists.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Remove_Retain_All {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(57);
        list1.add(50);
        list1.add(15);
        list1.add(62);
        list1.add(49);

        List<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(2);
        list2.add(1);
        list2.add(6);
        list2.add(9);
        System.out.println(list1);
        System.out.println(list2);


//        // Retain All
//        list1.retainAll(list2);
//        System.out.println(list1);


//        // Add All
//        list1.addAll(list2);
//        System.out.println(list1);
//
//
//        // Remove All
//        list1.removeAll(list2);
//        System.out.println(list1);


//      // Object to Array
        Object a[] = list1.toArray(); // here we convert array List to actual array which store int value
//        System.out.println(list1);
//        System.out.println(a[1]);

        for (Object e:a){
//            Integer temp = (Integer) e;
            System.out.println(e);
        }


    }
}
