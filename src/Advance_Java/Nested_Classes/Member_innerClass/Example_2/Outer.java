package Advance_Java.Nested_Classes.Member_innerClass.Example_2;

public class Outer {

    int a = 10;
    private int b = 20;
    static int c = 30;


    class Inner{
        int add = 0;
        void sum(){
            add = a+b+c; // inner class can access all the variables of Outer class
            System.out.println("Sum : "+add);
        }
    }


}
