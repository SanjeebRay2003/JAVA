package Advance_Java.Collection_Framework.Comparator_Comparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable {
    public static void main(String[] args) {
        Animal a1 = new Animal("Boxer",5,30);
        Animal a2 = new Animal("Duno",3,20);
        Animal a3 = new Animal("Rock",3,40);
        Animal a4 = new Animal("Alen",4,25);

        List<Animal> Dogs = new ArrayList<>();

        Dogs.add(a1);
        Dogs.add(a2);
        Dogs.add(a3);
        Dogs.add(a4);

        System.out.println(Dogs);
        Collections.sort(Dogs);
        System.out.println(Dogs);


    }
}
