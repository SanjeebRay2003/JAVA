package OOPs.Multithreading.Thread_Methods;

class M1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class M2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10;i++){
            try {
                Thread.sleep(800);

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}


public class Sleep_Method {
    public static void main(String[] args) {

        M1 obj1 = new M1();
        M2 obj2 = new M2();
        obj1.setPriority(9);
        obj2.setPriority(8);
        System.out.println(obj1.getPriority()); // get Priority of object
        System.out.println(obj2.getPriority());

        System.out.println(obj2.getState()); // get state of object ( new / runnable )

        obj1.start();
        obj2.start();


    }
}

