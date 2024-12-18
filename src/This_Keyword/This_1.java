package This_Keyword;

// printing reference of class using "this" keyword

public class This_1 {

    void show(){
        System.out.println(this);
    }

    public static void main(String[] args) {

        This_1 obj = new This_1();
        System.out.println(obj);
        obj.show();

    }
}
