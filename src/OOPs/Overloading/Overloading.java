package OOPs.Overloading;

public class Overloading {

    // overloading = methods with same name but different parameters
    // we cant do overloading by changing the return types (only parameters)

    static void msg (){
        System.out.println("this is without parameters");
    }

    static void msg(int a){
        System.out.println("this is with parameter int a = "+a);
    }

    static void msg(int a,int b){
        System.out.println("this is with different parameter int a = "+a+ " and int b = "+b);
    }

    public static void main(String[] args) {

        // here java automatically call the methods according to their parameters
        msg();
        msg(100);
        msg(100,200);

    }
}
