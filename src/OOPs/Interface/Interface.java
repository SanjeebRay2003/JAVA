package OOPs.Interface;

interface Human{

    int a = 50; // Every properties in interfaces is always final ( no need to declare as final )

    void eat();
    void run();

}

interface Human2{
    void speak();
    void read();
}

class Human_activity implements Human, Human2{  // we can implement multiple interface classes at a time ( main diff. in abstract and interfaces )

    // eat and run coming from interface class (Human)
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public  void run() {
        System.out.println("Running");
    }

    // speak and read is coming from interface class (Human2)
    public void speak(){
        System.out.println("Speaking");
    }

    public void read(){
        System.out.println("Reading");
    }

    public int a = 25; // we can modify the properties of interfaces in implementing class

}

public class Interface {
    public static void main(String[] args) {

//        Human human = new Human() ; // we did not create objects of interface classes

//        Human human = new Human_activity(); // but we use interface class as Reference of implementing class
//        human.eat();
//        human.run();
//        human.Speak();

        Human_activity human_activity = new Human_activity();
        human_activity.eat();
        human_activity.run();
        human_activity.speak();
        human_activity.read();

//        human_activity.a = 45; // we cant modify the properties of interfaces in main class

        System.out.println(human_activity.a);

    }
}

/* if we declare N methods in interface class and a class implementing that interface class then ->
        * we have to define ( create body of methods ) Every N declared methods with the help of overriding
        * Otherwise it throws Exception
        * we need to declare access modifier as public in every method of implementing class

 -> in interfaces we can implement multiple interface classes at a time , but in abstract we cant extend multiple abstract classes
 -> we can modify the properties of interfaces in implementing class but we cant modify in main class
 */
