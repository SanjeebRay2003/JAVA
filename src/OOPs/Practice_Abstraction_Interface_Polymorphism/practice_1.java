package OOPs.Practice_Abstraction_Interface_Polymorphism;

abstract class Pen{
  abstract  void write ();
  abstract void refill();
}

class FountainPen extends Pen{
    void changeNibble(){
        System.out.println("nibble is changing");
    }

    @Override
    void write() {
        System.out.println("Pen is writing");
    }

    @Override
    void refill() {
        System.out.println("Pen is refilling ");
    }
}

public class practice_1 {
    public static void main(String[] args) {

        FountainPen obj = new FountainPen();
        obj.changeNibble();
        obj.write();
        obj.refill();

    }
}
