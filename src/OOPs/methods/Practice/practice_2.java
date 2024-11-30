package OOPs.methods.Practice;

/* print the pattern
    *
    **
    ***
    ****
    ******
 */

public class practice_2 {
    static void pattern(int n){
        for (int i=0 ;i<n;i++){ // for rows
            for (int j=0;j<i+1;j++){ // for columns
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

/* first loop is for rows
    it print this
    * -> 0
    *
    *
    *
    * -> 4

    second loop is for column
    then it prints ( i + 1 )
    *  -> ( 0 + 1)
    **  -> ( 1 + 1 )
    ***
    ****
    *****  -> ( 4 + 1 )



 */

