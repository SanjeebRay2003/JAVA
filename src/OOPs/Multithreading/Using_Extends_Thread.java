package OOPs.Multithreading;

class thread1 extends Thread {
    @Override
    public void run() {  // this method is multithreading method
        int cooking = 0;
        while (cooking <= 100) {
            System.out.println("i am cooking now ");
            cooking++;
        }
    }

    void x(){
        System.out.println("i am random method from thread 1");
    }
}

class thread2 extends Thread{
    @Override
   public void run(){  // // this method is multithreading method
        int studying = 0;
        while (studying<=100){
            System.out.println("i am studying now ");
            studying++;
        }

    }

    void Y(){
        System.out.println("i am random method from thread 2");
    }
}

class boss extends thread1{
    int no (){
        return 5+5;
    }
}

public class Using_Extends_Thread{
    public static void main(String[] args) {

        thread1 obj1 = new thread1();
        thread2 obj2 = new thread2();

        // multithreading methods
        obj2.start();
        obj1.start();

        // other methods from thread classes
//        obj1.x();
//        obj2.Y();

//        boss obj = new boss();
//        System.out.println(obj.no());
//        obj.x();
//        obj.run();

    }
}

