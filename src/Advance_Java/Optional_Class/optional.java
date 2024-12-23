package Advance_Java.Optional_Class;

import java.util.List;
import java.util.Optional;

public class optional {

    public static Optional<Integer> hello(){
        Integer a = null;
        return Optional.ofNullable(a);
    }

    public static void main(String[] args) {

        Integer num = null ;

        Optional<Integer> val = Optional.ofNullable(num);
        System.out.println(val.isPresent()); // returns boolean
//        System.out.println(val.get()); // throws NoSuchElementException if value is null
        System.out.println(val.orElse(10)); // enters the value if it is not present ot null

        Optional<Integer> b = hello();
        System.out.println(b.orElse(100));

    }
}
