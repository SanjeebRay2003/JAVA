package OOPs.methods;

public class methods_Array {

    static void change(int[] arr){
        arr[1] = 100;

        /* in the case of array arr is reference of array not the actual array
        then the value of the element in array is changed */
    }

    public static void main(String[] args) {


        int [] arr = {10,20,30,40};
        System.out.println(arr);

        change(arr);
        System.out.println(arr[1]);


    }
}
