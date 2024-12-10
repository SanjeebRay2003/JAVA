package OOPs.Enums;

public class Enum {

    public enum months{
        JAN(1),FEB(2),MAR(3);
         int value;
        months(int value){
            this.value=value;
        }

    }

    public static void main(String[] args) {

        for (months m: months.values()){ // here months is working as array datatype , values is for printing all the constant objects
            System.out.println(m+" "+m.value);
        }

        System.out.println(months.valueOf("JAN")); // prints the specific value
        System.out.println(months.valueOf("FEB").ordinal()); // prints the index of that value




    }
}
/* enum is like class it contains constant objects , we cant create any object of these constants in main class
    it also contains methods(),constructors(),properties() these all are private by default in enum ,
    enum stores constant data in Array form
 */
