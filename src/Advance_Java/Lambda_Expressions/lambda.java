package Advance_Java.Lambda_Expressions;

//@FunctionalInterface // functional interface are those interface in which only one method is present
interface demo{
    void show(int a);
//    void show2(int a);
}

public class lambda {
    public static void main(String[] args) {

        demo obj = (int a) -> { // lambda expression
            System.out.println("show the demo "+ a );
        };
        obj.show(100);

    }
}

/*  with the help of lambda expression we directly define or override the methods of interface (Functional interface)
    no need to create a concrete class to define or override the methods of interface
 */
