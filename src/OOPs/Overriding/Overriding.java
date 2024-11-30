package OOPs.Overriding;



class A{
    void methodA(){
        System.out.println("i am method A");
    }
    int add(int a,int b){
        return a+b;
    }
}

class B extends A{
    @Override
    void methodA(){
        System.out.println("i am overriden method");
    }
}

public class Overriding {

    public static void main(String[] args) {

        B b = new B();
       int sum = b.add(12,13);
        System.out.println(sum);
       b.methodA();




    }

}
