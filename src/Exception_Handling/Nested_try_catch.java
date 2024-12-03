package Exception_Handling;

import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        Scanner input = new Scanner(System.in);
        boolean arrSize = true;

        while (arrSize) {

            System.out.println("Enter Your index");
            int index = input.nextInt();

            try {
                System.out.println("Welcome to Try-Catch ");
                try {
                    System.out.println(arr[index]);
                    arrSize = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Your index is not exist in the Array");
                }
            } catch (Exception e) {
                System.out.println("Handling Exception with outer Try-Catch");
            }
        }

    }
}
