package OOPs.methods.Practice;

// sum of first n natural numbers
public class practice_3 {
    static int sum(int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {

        int n = 1;
        System.out.println( sum(n));

    }
}
