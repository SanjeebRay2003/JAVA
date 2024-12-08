package Advance_Java.Generic;

import static Advance_Java.Generic.Generic_Method.showData;

public class Bounded_Generic {

    static <N extends Number> void showData (N data){
    System.out.println(data);
    }

        static <S extends String> void show (S data){
            System.out.println(data);
        }


    public static void main(String[] args) {

        showData(123);
//        showData("Ramu"); // string value does not possible because N is only add the number values ( int , double ,float )

        show("Sundram");
//        show(123); // Integer value does not possible because S is only add the String values ( String , char  )


    }
}

/* < N extends Number > -> only takes number values datatype ( int , double , float .. )
   < S extends String > -> only takes String value datatypes ( char , String .. )
 */
