package OOPs.Multithreading;

class multithread1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0;i<=100;i++){
            System.out.println("I am eating now ");
        }
    }

}

class multithread2 implements Runnable{
    @Override
    public void run(){
        for (int i = 0;i<=100;i++){
            System.out.println("I am Watching movie now ");
        }
    }

}


public class Using_Runnable_interface {
    public static void main(String[] args) {

        multithread1 obj1 = new multithread1();
        Thread OBJ1 = new Thread(obj1); // creating new thread object associate with obj1 which call obj1.run();
        multithread2 obj2 = new multithread2();
        Thread OBJ2 = new Thread(obj2);  // creating new thread object associate with obj2 which call obj2.run();

      
//        OBJ1.start();
//        OBJ2.start();

    }
}

/* creating new thread object because of Runnable interface have only one method to run that is run();
    but we need start(); method to start multithreading , and start(); method is present in Thread class,
    that's why we need to create new object of Thread for start multithreading

    run(); is present in Runnable interface not in Thread, but Thread is implements Runnable


 */