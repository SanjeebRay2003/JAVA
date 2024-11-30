package OOPs.Recursion;
import java.util.Scanner;

// factorials

public class Recursion {
    static int factorial(int a){


        if (a==0 || a==1 ){
            return 1;
        }
        else {

            // solve factorial with the help of for loop
//            int product =0 ;
//            for (int i=1;i<=a;i++){
//                product *= i;
//            }
//            return product;

            // solve factorial with the help of factorial key
            return a * factorial(a-1);
        }
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int a = input.nextInt();
        int a = 20;

        System.out.println(factorial(a));

    }
}
