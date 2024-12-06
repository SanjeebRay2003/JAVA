package Arrays.Practice;

import java.util.Scanner;

// print the values of array in reverse order with user input

public class practice_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of Array");
        int n = input.nextInt();

        int [] arr = new  int[n];

        System.out.println("Enter the values of array");
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Values of array in reverse order");
        for (int i =n-1;i>=0;i--){
            System.out.print(arr[i]);

        }


    }
}
