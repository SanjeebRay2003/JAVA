package Advance_Java.Builder_Pattern.Example_2;

public class Student_Info {
    public static void main(String[] args) {
        Students student1 = new Students.studentDetails()
                .setName("Abhishek yadav")
                .setFathersName("Rampal yadav")
                .setStandard(9)
                .setContactNo(1245786535)
                .setMarks(75)
                .build();

        System.out.println(student1);

        Students student2 = new Students.studentDetails()
                .setName("Arjun kumar")
                .setFathersName("Jagdish")
                .setStandard(10)
                .setContactNo(1245786535)
                .setMarks(82)
                .build();

        System.out.println(student2);
    }
}
