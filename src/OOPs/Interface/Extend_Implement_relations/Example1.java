package OOPs.Interface.Extend_Implement_relations;

interface interfaceOne{
    void method1();
    void method2();
}

interface interfaceTwo extends interfaceOne{
    void method3();
    void method4();
}

class interfaceMain implements interfaceTwo{

    // coming from interfaceOne ( it comes because of interfaceTwo extends interfaceOne ,
    // so we have to define methods of both interfaces )
    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

    //coming from interfaceTwo
    @Override
    public void method3() {
        System.out.println("method 3");
    }

    @Override
    public void method4() {
        System.out.println("method 4");
    }

}


public class Example1 {
    public static void main(String[] args) {
        interfaceMain obj = new interfaceMain();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();

    }
}
