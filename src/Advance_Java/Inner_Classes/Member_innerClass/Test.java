package Advance_Java.Inner_Classes.Member_innerClass;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Mustang");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

    }
}
