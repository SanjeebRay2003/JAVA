package OOPs.Constructors;

/* this is the use of constructor ,inheritance, overloading ,super key */

// Parent class
class first{
    first (){
        System.out.println("this is class first");

    }
    first(int a){
        System.out.println("first "+a);
    }
}

// Sub-parent class
class second extends first{
    second (){
        System.out.println("this is class second");

    }
    second(int a,int b){
        super(a);
        System.out.println("second "+b );
    }
}

// Child class
class third extends second{
  third(){
        super();
        System.out.println("this is class third");

    }
    third(int a,int b,int c){

        super(a,b);
        System.out.println("third "+c);
    }
}



public class Super {
    public static void main(String[] args) {

//        second obj = new second();
        third obj = new third(1,2,3);
        third obj1 = new third();

    }
}

/* it print in a sequence

  1  parent class
  2  sub-parent class
  3  child class  -> created object of class

    -> if we create object without argument then automatically java call the constructor which has no arguments (parameters)

    -> if we create objects with arguments then it call constructors with arguments
       and we get print in sequence with the help of Super key

    -> Super key is used only when the arguments or parameters is given

*/
