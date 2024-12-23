package Advance_Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class important_methods {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45,75,85,456,86,22,49,35,35,75,95,98,15,36);
        System.out.println(list);

        List<Integer> stream = list.stream()
                .filter(e -> e % 2 !=0)  // boolean value function
                .map(e -> e * 10) // return new value of element after operation
                .sorted() // sort the list
                .distinct() // ignores duplicate value
                .skip(2) // it skips first two elements
                .limit(3) // it collects only 3 elements
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

   10. skip(Long 3) => it skips first three element of List

   11. limit(Long 3) => it contain only first three elements in List


 */
