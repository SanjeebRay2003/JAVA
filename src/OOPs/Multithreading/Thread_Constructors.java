package OOPs.Multithreading;

class myThread extends Thread{
    myThread(String name){ // here we set the Name of thread using inbuilt constructor of Thread
        super(name); // gives the name

    }

    @Override
    public void run() {
        System.out.println("I am Thread");
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {

        myThread obj = new myThread("dinesh");
        System.out.println(obj.getName());
        System.out.println(obj.getId());



    }
}
