package Advance_Java.Collection_Framework.Comparator_Comparable.Comparable;

public class Animal implements Comparable<Animal> {
    String name;
    int age;
    int weight;

    Animal (String name,int age,int weight) {
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

    @Override // inbuilt method in comparable interface
    public int compareTo(Animal animal) { // It compares two values and sort it
        if (this.age == animal.age){ // when values are equal
            return this.name.compareTo(animal.name); // it sorts in the basis of names or String ( alphabetically )
        }
        return this.age - animal.age;
    }
}

/* if compareTo method returns
    1. Positive value then First Number is greater (a>b) -> b,a
    2. Negative value then second Number is greater (a<b) -> a,b
    3. Zero then both values are equal (a==b) -> in this condition sort in the basis of names
 */
