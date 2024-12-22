package Advance_Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class important_methods {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45,75,85,456,86,22,35,35,75,98,15,36);
        List<Integer> stream = list.stream()
                .filter(e -> e % 2 !=0)  // boolean value function
                .map(e -> e * 10) // return new value of element after operation
                .sorted() // sort the list
                .distinct() // ignores duplicate value
                .collect(Collectors.toList());
        System.out.println(stream);


//        //forEach
//        stream.forEach(System.out::println);
//        stream.forEach(e -> // forEach loop
//                System.out.println(e)
//        );

        Integer min = stream.stream().min((x,y) -> x.compareTo(y)).get();
        Integer max = stream.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("min : "+ min + "," +" max : "+ max);



    }


}

/*
   1. filter(predicate) => filter()
            predicate contain boolean value function

   2. map(function) => map()
            Operation on each element
            function : (e -> e * 10)
            returns a new value after Operation

   3. forEach() => Loop

   4. collect(collectors.toList) =>
            collect the functioned List

   5. sorted() => sort the List,set,Array

   6. distinct() => ignores duplicate values

   7. min((x,y) -> x.compareTo(y)) => find minimum value by using comparable method

   8. max((x,y) -> x.compareTo(y)) => find maximum value by using comparable method

   9. get() => Returns value


 */
