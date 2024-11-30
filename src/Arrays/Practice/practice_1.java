package Arrays.Practice;

// find the number is present in the array or not ?

public class practice_1 {
    public static void main(String[] args) {

        int[] numbers={10,50,60,40,30};
        int num = 30;
        boolean isPresent = false;
        for (int element: numbers){
            if (num == element){
                isPresent = true;
                break;
            }
        }

        if (isPresent){
            System.out.println("the number is present in the array");
        }
        else {
            System.out.println("number is not present in the array");
        }

    }
}
