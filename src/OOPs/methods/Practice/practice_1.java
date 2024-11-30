package OOPs.methods.Practice;

// print the table of any number (n)
public class practice_1 {

    static int table(int n){
        int multiply = 1;
        for (int i =1;i<=10;i++){
            multiply = n * i;
            System.out.printf("%d X %d = %d \n",n,i,multiply);
        }
        return multiply;
    }

    public static void main(String[] args) {
        int n = 5;
        table(n);
    }
}
