package Advance_Java.Streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<String> animals = List.of("Dog","Cat","Horse","Zebra","Elephant","Pig","Donkey");
        System.out.println(animals);

        List<String> give = animals.stream().filter(e -> e.endsWith("t")).map(e -> e.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(give);


    }
}
