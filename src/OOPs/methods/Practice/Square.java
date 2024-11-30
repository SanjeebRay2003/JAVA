package OOPs.methods.Practice;

class Operations{
    int side;

    int area(){
        return side * side;
    }

//    double sides(){
//        return Math.sqrt(area);
//    }

    int parameter(){
        return 4 * side;
    }



}

public class Square {
    public static void main(String[] args) {

        Operations square = new Operations();
        square.side =6;

        System.out.println(square.area());
//        System.out.println(square.side());
        System.out.println(square.parameter());

    }
}
