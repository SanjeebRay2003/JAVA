package OOPs.Practice_Abstraction_Interface_Polymorphism;

 abstract class Telephone{
    abstract void ring();
    abstract void light();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{

    @Override
    void ring() {
        System.out.println("ringing");
    }

    @Override
    void light() {
        System.out.println("light is on");
    }

    @Override
    void disconnect() {
        System.out.println("phone is disconnected");
    }

    void camera(){
        System.out.println("clicking pictures");
    }
}

public class practice_3 {
    public static void main(String[] args) {
        Telephone telephone = new SmartTelephone();
//        telephone.camera; // we did not access camera due to polymorphism
        telephone.disconnect();
        telephone.ring();
        telephone.light();
    }
}
