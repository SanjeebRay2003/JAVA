package Advance_Java.Exception_Handling;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return " I am toString method ";
    }

    @Override
    public String getMessage() {
        return " I am getMessage method ";
    }
}

public class Customized_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();

        if(num<10){
            try {
                throw new myException(); // custom Exception
            }
            catch (myException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());

            }
        }

    }
}
