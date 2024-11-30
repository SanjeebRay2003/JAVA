package OOPs.Practice_Abstraction_Interface_Polymorphism;

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("jumping");
    }

    void bite(){
        System.out.println("biting");
    }
}

 class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}

public class practice_2 {
    public static void main(String[] args) {

//        Human human = new Human();
//
//        human.eat();
//        human.bite();
//        human.sleep();
//        human.jump();

        // using polymorphism
        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();



    }
}
