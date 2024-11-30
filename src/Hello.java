


class mobile{
    String name;
   static String use;

    public void show(){
        System.out.println(name+":"+use);
    }
}



public class Hello {
    public static void main(String[] args) {


        mobile mob1 = new mobile();
        mob1.name="apple";
        mob1.use="calling";
        mob1.show();


        mobile mob2 = new mobile();
        mob2.name="realme";

        mob2.show();


    }
}
