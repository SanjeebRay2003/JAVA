package Advance_Java.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        // Converting an Array List into Stream
        List<String> list = Arrays.asList("Dog","Cat","Elephant","horse"); // List
        List<String> stream = list.stream().sorted().collect(Collectors.toList());
        System.out.println(stream);

        // Converting an array into stream
        String[] animals = {"Dog","Cat","Elephant","horse"}; // array
        List<String> Animal = Arrays.stream(animals).collect(Collectors.toList());
        System.out.println(Animal);

        // converting a List into a Stream
        List<Integer> l = Arrays.asList(45, 50, 100); // list
        List<Integer> s = l.stream().map(x -> x*2).sorted().collect(Collectors.toList());
        System.out.println(s);

        // Creating Stream Directly
        Stream<Integer> abc = Stream.of(1,2,3,4,5,85,45);
        List<Integer> a =abc.collect(Collectors.toList());
        System.out.println(a);

        // Creating Stream Directly
        Stream<Integer> xyz = Stream.iterate(0,n->n+1).limit(10);
        List<Integer> x = xyz.collect(Collectors.toList());
        System.out.println(x);


    }
}

/* stream doesn't store any value that's why we need to Store data in a List or .. etc

    collect(Collectors.toList) -> it collect the elements in the form of a List

 */
