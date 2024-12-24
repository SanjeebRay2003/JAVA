package Advance_Java.Nested_Classes.Static_innerClass.Example_2;

public class Main {
    public static void main(String[] args) {
        OuterClass objO = new OuterClass(); // object of outer class no need to create for creating static inner class object
//        System.out.println(objO.a = 100);

        OuterClass.InnerClass objI = new OuterClass.InnerClass();
        objI.show();


    }
}
