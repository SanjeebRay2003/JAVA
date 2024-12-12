package Advance_Java.Collection_Framework.Sets.Hash_Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class studentDetails {

    void xyz (){
        System.out.println("hello");
    }

    int rollNo;
    String name;

    public studentDetails(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        studentDetails details = (studentDetails) o;
        return rollNo == details.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class hashCode_equals_Methods {
    public static void main(String[] args) {
//        Set<String> students = new HashSet<>();
//
//        students.add("Aman");
//        students.add("Ajay");
//        students.add("Sundram");
//        students.add("Aman");

        Set<studentDetails> students = new HashSet<>();

//        studentDetails s1 = new studentDetails(1,"Dinesh");
//        studentDetails s2 = new studentDetails(1,"Suman");
//        System.out.println(s1.equals(s2));


        students.add(new studentDetails(1,"Aman"));
        students.add(new studentDetails(2,"Karan"));
        students.add(new studentDetails(4,"Aman"));
        students.add( new studentDetails(3,"Suman"));




        System.out.println(students);


    }
}
