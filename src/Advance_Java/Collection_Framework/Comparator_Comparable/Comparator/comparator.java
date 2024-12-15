package Advance_Java.Collection_Framework.Comparator_Comparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class myCustomComparator implements Comparator<Human>{

    @Override
    public int compare(Human person1, Human person2) {
        return Integer.compare(person1.age ,person2.age);
//        return person1.age - person2.age;
    }
}

public class comparator{

    public static void main(String[] args) {
        Human h1 = new Human("Manish",22,72);
        Human h2 = new Human("Manoj",28,70);
        Human h3 = new Human("Tanisk",20,65);
        Human h4 = new Human("Durgesh",24,80);

        List<Human> humans = new ArrayList<>();
        humans.add(h1);
        humans.add(h2);
        humans.add(h3);
        humans.add(h4);
        System.out.println(humans);

//        Collections.sort(humans,new myCustomComparator()); // sort in the basis of age

//        Collections.sort(humans,(person1,person2) -> person1.age - person2.age);  // sort by age using lambda expression



 //      //  In comparators we can directly change comparator here no need to modify custom class
//        Collections.sort(humans, new Comparator<Human>() {
//            @Override
//            public int compare(Human person1, Human person2) {
//                return person1.name.compareTo(person2.name); // sort in the basis of names
//            }
//        });

        Collections.sort(humans,(person1,person2) -> { return person1.name.compareTo(person2.name);
        }); // sort by name using lambda expression

        System.out.println(humans);
    }
}

/*
    In comparators we can directly change comparator here no need to modify custom class

 */
