package Advance_Java.Collection_Framework.Lists.Linked_List;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();

        arr.add(57);
        arr.add(50);
        arr.add(15);
        arr.add(62);
        arr.add(49);

        LinkedList<Integer> arr2 = new LinkedList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(6);
        arr.add(9);

        arr.addAll(arr2); // adding arr2 in arr
        arr.add(2,500);

        System.out.println("In array form : \n"+arr); // this prints the elements of array in the form of array

        for (int i = 0; i<arr.size();i++){ // printing all the elements of array
            System.out.print(arr.get(i) + " ");
        }


        System.out.println("\nThis element is present in array or not : "+arr.contains(500)); // return boolean
        System.out.println("index of element in array : "+arr.indexOf(500));
        arr.remove(3);

        arr.set(1,100);// update the element using index

        arr.addLast(1000); // add the element in the Last linkedList
        arr.addFirst(5000); // add the element in the first of linkedList

        for (int i = 0; i<arr.size();i++){ // printing all the elements of array
            System.out.print(arr.get(i) + " ");
        }
    }
}
