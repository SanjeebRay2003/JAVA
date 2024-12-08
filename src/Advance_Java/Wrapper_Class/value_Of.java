package Advance_Java.Wrapper_Class;

/* valueOf() converts the datatype of value according to Declaration
    "500" -> 500
    String -> Integer
 */

public class value_Of {
    public static void main(String[] args) {

        Integer A = Integer.valueOf("500"); // String value to Integer value

        Integer result = A/2;
        System.out.println(result);


        String B = String.valueOf(100); // Integer value to String value

        System.out.println("value of B = "+B);

    }
}
