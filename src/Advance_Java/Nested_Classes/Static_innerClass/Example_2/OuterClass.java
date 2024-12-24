package Advance_Java.Nested_Classes.Static_innerClass.Example_2;

public class OuterClass {
   static int a = 10;

 static   void displayOuter(){
       System.out.println("the value of a from Outer class : "+a);
   }


    static class InnerClass { // static inner class can access all the static variable and static methods of Outer class
        void show(){
            System.out.println(a);
            displayOuter();
            System.out.println("hello this is static inner class");

        }

    }


}
