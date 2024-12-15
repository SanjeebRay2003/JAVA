package Advance_Java.Collection_Framework.Comparator_Comparable.Comparator;

import Arrays.Array;

import java.util.Arrays;
import java.util.Comparator;

/* sort the 2D array in the basis of their first elements
    1. if first element is same then check for second
    2. if second element is same then check for third
 */


public class Sort_2D_Array {


    public static void main(String[] args) {
        int[][] number = {
                {1,2,53},
                {1,2,33},
                {1,2,13}
        };

        Arrays.sort(number , (arr1,arr2) -> {
            if(arr1[0] == arr2[0]){  // enters when first element is same

                if (arr1[1] == arr2[1]) { // enters when second element is same
                return Integer.compare(arr1[2],arr2[2]); // it checks for third element [2}
            }

                return Integer.compare(arr1[1],arr2[1]);  // it checks for second element [1]
            }

            return Integer.compare(arr1[0],arr2[0]); // it checks for first element [0]
        });


        for (int[] array:number){
            for (int arrays :array){
                System.out.print(arrays+" ");
            }
            System.out.println();
        }

    }
}
