package OOPs.methods;

// varArgs  ->  (int ...arr)

public class method_3 {

    static int sum(int a,int b){ // this is the method with two parameters
        return a+b;
    }

    static int sumAll(int ...arr){ // this is the method with parameters like array (multiple parameters)
                                    // no requires to denote multiple parameters
        int result = 0;
        for (int a:arr){ // for-each loop
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20)); // only valid two parameters , it solve only two parameters
        System.out.println(sumAll(10,20,400,500,400,200,300)); // it solve all the parameters
                                                                    // ( its like we adding all the elements of an array)
    }
}
