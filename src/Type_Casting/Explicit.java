package Type_Casting;

public class Explicit {
    public static void main(String[] args) {

        double a = 10;
        int b = (int) a;

        System.out.println(b);


    }
}
/* explicit convert the large data type to small , we have to convert manually
   double -> 8 byte to int -> 4 byte
   to convert large to small we have to declare (int)
 */
