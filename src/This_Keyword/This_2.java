package This_Keyword;

// when the instance object and local object have same name

public class This_2 {
    int a;  // instance object
     int show(int a) { // local object
        this.a=a;
        return a;
    }

    public static void main(String[] args) {

        This_2 obj = new This_2();
        System.out.println(obj.show(100));

    }
}
