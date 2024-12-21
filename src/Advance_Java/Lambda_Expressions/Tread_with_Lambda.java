package Advance_Java.Lambda_Expressions;

public class Tread_with_Lambda {
    public static void main(String[] args) {

        // thread 1
        Runnable runnable1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };



        // thread 2
        Runnable runnable2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();



    }
}
