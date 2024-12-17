package Patterns;

public class patterns {

    public static void main(String[] args) {

//        pattern_1(5);
//        pattern_2(5);
        patter_3(5);


    } // main class ends here


    // 1.
    public static void pattern_1(int n){

        /*

            * * * * *
            * * * * *
            * * * * *
            * * * * *

        */
        for (int i=1 ;i <= n; i++){
            for (int j=1; j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    // 2.
    public static void pattern_2(int n){
        /*

             *
             * *
             * * *
             * * * *
             * * * * *

         */
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // 3.
    public static void patter_3(int n){
        /*

             * * * * *
             * * * *
             * * *
             * *
             *

         */
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }


}
