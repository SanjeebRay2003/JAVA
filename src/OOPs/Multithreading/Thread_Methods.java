package OOPs.Multithreading;

class meth1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println("I am method 1");
        }
    }
}

class meth2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println("I am method 2");
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        meth1 obj1 = new meth1();
        meth2 obj2 = new meth2();
        obj1.start();

        try{
            obj1.join(); // this join method complete the obj1 and then start obj2
        }catch (Exception e){
            System.out.println(e);
        }

        obj2.start();
    }
}
