package Exception_Handling;

public class try_catch {
    public static void main(String[] args) {
        double a = 10;
        double b = 100;

        try {
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("program failed . Reason -> \n" + e);
        }

        System.out.println("End of this program");
    }
}
