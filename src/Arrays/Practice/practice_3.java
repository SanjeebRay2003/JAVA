package Arrays.Practice;

// Adding two matrices (2X3)
public class practice_3 {
    public static void main(String[] args) {

        int[][] arr1 = {
                {100, 200, 300},
                {1000, 2000, 3000}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {10, 20, 30}
        };
        int[][] result = {
                {0, 0, 0},
                {0, 0, 0}
        };


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");


        }
    }
}
