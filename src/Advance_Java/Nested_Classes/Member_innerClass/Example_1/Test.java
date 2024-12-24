package Advance_Java.Nested_Classes.Member_innerClass.Example_1;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Mustang");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

    }
}
