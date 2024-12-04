package Exception_Handling;

class negativeRadiusExceptions extends Exception{
    @Override
    public String toString() {
        return " Radius never be negative (toString)";
    }

    @Override
    public String getMessage() {
        return " Radius never be negative (getMessage)";
    }
}

 class Area {
    /* // This method is without throws Exception
   static double area (int r)  {

      double ar = 0;
       if (r < 0) {
           System.out.println("Radius not in Negative");
       }
       else {
            ar = Math.PI * r * r;
           System.out.println(ar);

       }
       return ar;
   }
   */

      // this Method is throws Exception
    static double area (int r) throws negativeRadiusExceptions {
        if (r < 0) {
            throw new negativeRadiusExceptions();
        }
        double ar = Math.PI * r * r;
        System.out.println("Area : " +ar);
        return ar;
    }



}

class throwsWord {
   static void devide() throws ArithmeticException{

        int a = 10;
        int b = 10;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

public class throw_throws {
    public static void main(String[] args)  {

//        throwsWord.devide();

//        Area.area(-2); // with out throws Exception


 // with Throws Exception
        try {
            Area.area(20);
        }
        catch (negativeRadiusExceptions exceptions) {
            System.out.println(exceptions);
        }


    }
}
