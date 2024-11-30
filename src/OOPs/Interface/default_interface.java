package OOPs.Interface;

interface car{
    void speed();
    void name();

    default void color(){
        System.out.println("Black");
    }

}

class carDetails implements car{

    @Override
    public void speed() {
        System.out.println("speed is high");
    }

    @Override
    public void name() {
        System.out.println("Mustang");
    }

    public void color(){  // default
        System.out.println("Green");
    }
}

public class default_interface {
    public static void main(String[] args) {
        carDetails Car = new carDetails();

        Car.name();
        Car.color();
        Car.speed();
    }
}
