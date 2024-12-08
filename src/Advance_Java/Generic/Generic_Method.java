package Advance_Java.Generic;

class custom {

}

public class Generic_Method {

    static <s> void showData (s data){
        System.out.println(data);
    }

    // non static method
    <ns> void show(ns data){
        System.out.println(data);
    }

    public static void main(String[] args) {

        showData(123);
        showData("Ramu");

        // for non-static method
        Generic_Method nonStatic = new Generic_Method();
        nonStatic.show(2000);
        nonStatic.show("Sundram");

        custom obj = new custom();
        nonStatic.show(obj); // this obj gives reference of its class

    }
}

/* no need de declare any non primitive datatype java automatically take the value

 */
