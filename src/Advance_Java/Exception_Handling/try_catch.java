package Advance_Java.Exception_Handling;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int size = numbers.length;

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the index of Array :");
        int index = input.nextInt();

        System.out.println("Enter the Number :");
        int num = input.nextInt();

        try {
            System.out.println("The element of array at this index is : " +numbers [index]);
            System.out.println("Sum of : " + numbers[index] + " / "+ num+ " = " + numbers[index]/num);
        }
        catch(IndexOutOfBoundsException exception ){
            System.out.println("your index is not Exist in this Array of size : " +size+ "\n" + exception);
        }
        catch (ArithmeticException exception){
            System.out.println("Error in Arithmetic Operation" + exception);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
