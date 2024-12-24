package Advance_Java.Nested_Classes.Static_innerClass.Example_1;

public class Computer {
   static  String brand;
   static  String model;

    static OperatingSystem os;

    public Computer(String brand, String model,String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public OperatingSystem getOs() {
        return os;
    }

    static class OperatingSystem {

       static String osName;

       public OperatingSystem(String osName) {
           this.osName = osName;
       }
   }


}
