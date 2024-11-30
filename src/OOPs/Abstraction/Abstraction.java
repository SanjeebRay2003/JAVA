package OOPs.Abstraction;


abstract class Parent{
    void running(){
        System.out.println("I am Running");
    }

    abstract void eating();

}

abstract class Parent2{
    void running(){
        System.out.println("I am Running");
    }

    abstract void eating();

}

class Child1 extends Parent{

    void reading (){
        System.out.println("I am Reading");
    }

    @Override
    void eating() {
        System.out.println("I am Eating");
    }
}

 abstract class Child2 extends Parent{

    void sleep(){
        System.out.println("I am Sleeping");
    }

}


public class Abstraction {
    public static void main(String[] args) {

//        Parent P = new Parent() ;  // These two classes are not implemented in main class due to Abstract classes
//        Child2 C2 = new Child2() ;

        Child1 C1 = new Child1();
        C1.reading();
        C1.eating();

    }
}

/* If a class have abstract method then the whole class is converting to a abstract class
    if a class is extends a abstract class then ->
                1. it is require to convert the child class into abstract class or..
                2. Override the abstract method of abstract class

                he have to do one thing from these above 2 methods
 */
