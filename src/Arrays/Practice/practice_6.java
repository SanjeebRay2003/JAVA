package Arrays.Practice;

// detect the array is sorted or not
public class practice_6 {
    public static void main(String[] args) {
        int [] arr = {10,50,71,60,40,50,30};

        boolean isSorted = true;
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }
    }
}
