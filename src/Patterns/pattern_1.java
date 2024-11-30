package Patterns;

public class pattern_1 {

    public static void main(String[] args) {

        pat_1(5);
//        pat_2(5);

    }

    public static void pat_1(int n){

        for (int i=1 ;i <= n; i++){
            for (int j=1; j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

//    public static void pat_2(int n){
//        for (int i=n;i>=0;i++){
//            for (int j=n;j<i-1;j++){
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
//    }

}
