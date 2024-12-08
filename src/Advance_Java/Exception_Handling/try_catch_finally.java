package Advance_Java.Exception_Handling;

public class try_catch_finally {

    static int number(){
        int x = 10;
        int y = 10;

        try {
            System.out.println(x/y);
            return 0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally");
        }

        return 0;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            System.out.println(a/b);
        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        finally {
            System.out.println("I am finally");
        }

//        number();

    }
}

/* finally statement prints always , does not effect any return , break;, exception

    if we did not write catch with try but we write finally then program also run
    first finally statement  is execute end then shows the error
 */
