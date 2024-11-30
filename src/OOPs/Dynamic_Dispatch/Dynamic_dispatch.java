package OOPs.Dynamic_Dispatch;

class Parent {
    void One(){
        System.out.println("one");
    }

    void common(){
        System.out.println("I am common (Parent)");
    }
}

class Child extends Parent{
    void Two(){
        System.out.println("Two");
    }

    void common(){
        System.out.println("I am common (Child)");
    }
}

public class Dynamic_dispatch {
    public static void main(String[] args) {

        // Objects
        Parent P = new Parent(); // Allowed
        P.One();
        P.common();

        Child C = new Child(); // Allowed
        C.Two();
        C.common();

        Parent PC = new Child();  // Allowed
        PC.One();
        PC.common();
//        PC.Two(); // Not allowed
                    // because PC is the object of Child class Parent is only the Reference of child class
                    // ( it allowed to call the Overridden method of child only )

//        Child CP = new Parent();  // Not-Allowed
                                    // because a Child class is never be a reference of Parent class
                                    // but a Parent class is to be reference of Child class

    }
}
