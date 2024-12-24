package Advance_Java.Nested_Classes.Member_innerClass.Example_2;

public class MemberClass {
    public static void main(String[] args) {
        Outer objO = new Outer();
        Outer.Inner objI = objO.new Inner();
        objI.sum();
    }
}
