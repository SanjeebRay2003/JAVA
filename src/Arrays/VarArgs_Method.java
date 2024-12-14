package Arrays;

public class VarArgs_Method {
    // varArgs  ->  (int ...arr)

    static int sumAll(int... arr) { // this is the method with parameters like array (multiple parameters)
        // no requires to denote multiple parameters
        int result = 0;
//        int result = 1;

        for (int a : arr) { // for-each loop
            result += a;
//            result *= a;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumAll(10, 20, 400, 500, 400, 200, 300)); // it solve all the parameters
        // ( its like we adding all the elements of an array)
    }
}

