package Advance_Java.Wrapper_Class;

/* wrapper class is basically wrap the data types ->
    int -> Integer
    char -> Character
    string -> String
    double -> Double
    boolean -> Boolean
    float -> Float
*/

public class wrapper_class {
    public static void main(String[] args) {

        // these are the ways to declare Integer  ( AutoBoxing )
//        Integer obj = new Integer(50);
        Integer obj2 = Integer.valueOf(50);
        Integer obj3 = 50;

        // convert Integer to -> int ( Unboxing )
        int a = obj3;

    }
}
