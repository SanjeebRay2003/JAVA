package Advance_Java.Nested_Classes.Static_innerClass.Example_1;

public class Device {
    public static void main(String[] args) {
        Computer computer = new Computer("HP","Victor","Microsoft window");
        System.out.println(computer);
        System.out.println(Computer.getBrand());


    }
}
