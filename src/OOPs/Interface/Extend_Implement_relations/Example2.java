package OOPs.Interface.Extend_Implement_relations;


abstract class absOne implements Iface{
//    void x(){
//        System.out.println("this is X");
//    }

    abstract void abs();

    @Override
    public void If() {
        System.out.println("this is If from interface ( absOne )");
    }
}

interface Iface{
//    default void y(){
//        System.out.println("this is Y");
//    }

    void If();

}


 class absMain extends absOne{

     @Override
     void abs() {
         System.out.println("abstract method from abstract class");
     }

//     @Override
//     public void If() {
//         System.out.println("this is If from Interface ( absMain )");
//     }

 }


// class absMain2 extends absOne{
//
//}

public class Example2 {
    public static void main(String[] args) {
        absMain absObj = new absMain();
        absObj.If();
        absObj.abs();
    }
}

/* we can define the method of interface class in a abstract class which is implements that interface class
    or we also define in the class which is extends that abstract class

    in abstract class ( optional )
    if we did not define interface method in abstract class then we have to define in class which is extends that abstract class
    and this class is first priority for define body of interface method in java
    
 */
