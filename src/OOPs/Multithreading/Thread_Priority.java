package OOPs.Multithreading;

class priority extends Thread{

    priority(String name){
        super(name);
    }
    @Override
    public void run() {
//        for (int i = 0;i<=10;i++){
            System.out.println("I am thread " +this.getName());
//        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {

        priority p1 = new priority("aman");
        p1.setPriority(Thread.MAX_PRIORITY);
        priority p2 = new priority("dinesh");
        priority p3 = new priority("kajal");
        p3.setPriority(Thread.MIN_PRIORITY);
        priority p4 = new priority("ramesh");

        p1.start();
        p2.start();
        p3.start();
        p4.start();


    }
}
