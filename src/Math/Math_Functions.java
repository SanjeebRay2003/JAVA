package Math;

public class Math_Functions {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 2)); // a = number ,b = power number
        System.out.println(Math.abs(-10));
        System.out.println(randomNum(1,5));
        System.out.println(Math.floor(5.1));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.round(5.6));

    }

    public static int  randomNum(int a, int b){
        return (int) (Math.random()*(b-a)+1);
    }
}
