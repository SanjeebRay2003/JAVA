package Arrays.Practice;

// find the maximum element of array
public class practice_5 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,0,50};

//        int max =0;
//        for (int element: arr){
//           if (element>max){
//               max = element;
//           }
//        }
//        System.out.println(max);

        int max = 0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
               max = arr[i];
           }
        }
        System.out.println(max);
    }
}
