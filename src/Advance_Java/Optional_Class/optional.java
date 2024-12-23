package Advance_Java.Optional_Class;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {

        Optional<Integer> val = Optional.ofNullable(45);
        System.out.println(val.isPresent());

    }
}
