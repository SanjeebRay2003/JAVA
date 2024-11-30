package Arrays;

public class Array {

    public static void main(String[] args) {

        //int [] arr = new int[5]; // creating array and declare length of array at a same tie

//        int arr[]; // creating array
//        arr = new int[5]; // length declaration

        int arr[] = {10,20,30,40,50}; // creating array and declare the elements at a same time ,
                                        // here java automatically calculate the length of array

//        arr[0] =10;
//        arr[1] =20;
//        arr[2] =30;
//        arr[3] =40;
//        arr[4] =50;

//        System.out.println(arr[4]);

        // printing all elements of array using for loop
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

        // printing all elements of array using for each loop
        for (int element: arr){
            System.out.println(element);
        }

        // adding all elements of array
//        int sum = 0;
//        for (int i=0;i< arr.length;i++){
//            sum += arr[i];
//        }
//        System.out.println(sum);

        // multiply all elements of array
        int multiply = 1;
        for (int i=0;i< arr.length;i++){
            multiply *= arr[i];
        }
        System.out.println(multiply);
    }
}
