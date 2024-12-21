package Advance_Java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Exp {
    public static void main(String[] args) {

        // Q. Create a list of natural numbers and generate a new list of even numbers from created list

        //Creating List
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(45);
        list.add(76);
        list.add(46);
        list.add(61);
        System.out.println("Created list : " + list);

//        // without stream
//        List<Integer> evenList = new ArrayList<>();
//        for (Integer e : list) {
//            if (e % 2 == 0) {
//                evenList.add(e);
//            }
//
//        }
//        System.out.println("list of Even elements without stream : " + evenList);


        // With stream
        List<Integer> streamEvenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("list of Even elements with stream : " + streamEvenList);

        //forEach
//        streamEvenList.forEach(e -> // forEach is loop in stream
//                System.out.println(e/2)
//        );


//        streamEvenList.add(450);
//        System.out.println(streamEvenList);

        // map
//        List<Integer> streamEvenList2 = list.stream().map(x -> x*2).collect(Collectors.toList());
//        System.out.println(streamEvenList2);





    }
}
