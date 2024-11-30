package OOPs.Classes;

class Students{
    int id;
    String name;
    public void Details(){
        System.out.println("student id is "+ id);
        System.out.println("student name is "+name);
    }
}

public class Custom_Class {
    public static void main(String[] args) {

        Students student = new Students();
        student.id = 12;
        student.name = "Sanjeeb";

        student.Details();


//        System.out.println(obj.id);
//        System.out.println(obj.name);

    }
}
