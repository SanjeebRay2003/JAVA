package Advance_Java.Generic;

class human<I , N> {

    I id;
    N name;

    public  human(I id ,N name){  // constructor ( set Id )
        this.id = id;
        this.name = name;
    }

    public I getId(){
        return id;
    }

    public N getName() {
        return name;
    }
}

public class Generic_class {
    public static void main(String[] args) {
        human<Integer,String> Id1= new human<>(500,"Rahul"); // here we set the id
        human<String,Integer> Id2 = new human<>("Rahul",500);

        human<Integer,Integer> Id3 = new human<>(100,200);
        human<String,String> Id4 = new human<>("Aman","Ashish");

        // Integer,String
//        System.out.println("Id -> "+Id1.getId());
//        System.out.println("Name -> "+Id1.getName());

        // String,Integer
        System.out.println("Id -> "+Id2.getId());
        System.out.println("Name -> "+Id2.getName());

        // Integer,Integer
//        System.out.println("Id -> "+Id3.getId());
//        System.out.println("Name -> "+Id3.getName());

        // String,String
//        System.out.println("Id -> "+Id4.getId());
//        System.out.println("Name -> "+Id4.getName());

    }
}

/* Generic is use to set any variable with any datatype with the help of any alphabet  <E>
    no need to declare data type instead of data type we declare alphabet E

    in main class during creating object of class we declare the datatype (non primitive)
 */
