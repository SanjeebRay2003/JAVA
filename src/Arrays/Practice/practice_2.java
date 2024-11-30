package Arrays.Practice;

// calculate the average  marks in physics of every student
public class practice_2 {
    public static void main(String[] args) {
        int [] physics = {60,80,70,58,66};
        
        int sum = 0;
//        int avg = 0;
        for (int element : physics){
            sum += element;
//           avg = sum/physics.length;
        }
        System.out.println("average of marks "+ sum/physics.length);
    }
}
