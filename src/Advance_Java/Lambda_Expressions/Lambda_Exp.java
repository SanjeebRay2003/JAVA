package Advance_Java.Lambda_Expressions;

interface txt{
    void msg(int a);
}

@FunctionalInterface
interface number{
    int num(int a,int b);
}

@FunctionalInterface
interface name{
    int str(String name);
}

public class Lambda_Exp {

    public static void main(String[] args) {

        // for txt functional interface
        txt val1 = (int a)->{  // basically we define the abstract method of interface here
            System.out.println(a);
        };
        val1.msg(50);

        txt val2 = (int a) -> System.out.println(a);
        val2.msg(60);


        txt val =  a -> System.out.println(a);
        val.msg(45);

    // for number functional interface
        number numValue = (int a,int b)  -> {return a+b;};
        System.out.println("sum of a and b : "+numValue.num(45,55));

        number numValue2 = (a,b) -> {return a+b;};
        System.out.println("sum of a and b : "+numValue2.num(45,155));


        // for Name functional interface
        name name2 = (name) -> {
            return name.length();
        };
        System.out.println(name2.str("Anmol"));

        name name1 = name -> name.length();
        System.out.println(name1.str("Aman"));

    }
}
