package This_Keyword;

public class This_3 {

     This_3(){
        System.out.println("Default constructor");
    }

    This_3(String name){
        this(); // this keyword call the default constructor
//         this("Sanjeeb",22); // we can also call the parameterized constructor
        System.out.println(name);
    }

    This_3(String name,int age){ // parameterized constructor
        System.out.println(name+" : "+age);
    }


    public static void main(String[] args) {

         This_3 obj = new This_3("Aman");


    }
}
