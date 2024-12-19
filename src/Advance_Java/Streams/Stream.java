package Advance_Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,48,6,4,96,2,44,21,20,12,20);
//        Stream<Integer> abc = num.stream().filter(x -> x%2 == 0).map(x -> x/2).sorted();
//        System.out.println(abc);

        List<Integer> stream = num.stream().filter(x -> x % 2 ==0).map(x -> x*2).sorted().distinct().collect(Collectors.toList());
        System.out.println(stream);
    }
}
