package Advance_Java.Collection_Framework.Lists.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(57);
        arr.add(50);
        arr.add(15);
        arr.add(62);
        arr.add(49);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(2);
        arr2.add(1);
        arr2.add(6);
        arr2.add(9);

        System.out.println(arr);

        List<Integer> sublist = arr.subList(1,3);
        System.out.println(sublist);

        arr.addAll(2,arr2); // add the arr2 in arr according to given index



        arr.add(2,500);

        System.out.println("In array form : \n"+arr); // this prints the elements of array in the form of array

        for (int i = 0; i<arr.size();i++){ // printing all the elements of array
            System.out.print(arr.get(i) + " ");
        }


        System.out.println("\nThis element is present in array or not : "+arr.contains(500)); // return boolean
        System.out.println("index of element in array : "+arr.indexOf(500));
        arr.remove(3);

        arr.set(1,100); // update the element using index

        for (int i = 0; i<arr.size();i++){ // printing all the elements of array
            System.out.print(arr.get(i) + " ");
        }




    }
}
