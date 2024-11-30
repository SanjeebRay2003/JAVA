package OOPs.methods.Practice;

/* print this pattern
    *****
    ****
    ***
    **
    * 
 */

public class practice_4 {
    static void pattern(int n){
        for (int i=n ;i>0;i--){ // for rows
            for (int j=i;j>0;j--){ // for columns
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
