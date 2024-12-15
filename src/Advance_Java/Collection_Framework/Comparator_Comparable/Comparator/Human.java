package Advance_Java.Collection_Framework.Comparator_Comparable.Comparator;

public class Human {
    String name;
    int age;
    int weight;

    Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}' + "\n";
    }
}
