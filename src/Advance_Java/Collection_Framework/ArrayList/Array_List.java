package Advance_Java.Collection_Framework.ArrayList;


import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(57);
        arr.add(50);
        arr.add(15);
        arr.add(62);
        arr.add(49);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(6);
        arr.add(9);

//        arr2.add("aman");
//        arr2.add("arjun");
//        arr2.add("kartik");
//        arr2.add("dinesh");
//        arr2.add("shubham");

        arr.addAll(arr2);




        for (int i = 0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        System.out.println(arr.size());

    }
}
