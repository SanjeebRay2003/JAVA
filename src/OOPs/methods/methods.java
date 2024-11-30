package OOPs.methods;

public class methods {

     static int multiply(int a,int b){ // this is a method which is returning the int value

        int mult = a * b;
        return mult;


        // if change the value of a and b in the function it does not affect in the main class
         // because the java gives priority to the local declaration

    };

    public static void main(String[] args) {
        int a =10;
        int b =100;

//        methods obj =new methods(); // here we need to  create an object of class to call the method ( due to, when the method is non-static)
//        int sol = obj.multiply(a,b);

//        int sol = multiply(10,20); // if we didn't declare a and b then we also declare in parameters

        int sol = multiply(a,b); // here we call the method directly due to static method

        System.out.println(sol);

    }
}
