package Arrays;

public class Array_2D {
    public static void main(String[] args) {

        int arr2d [][]= {
                {10,20,30},
                {100,200,300}
        };

//        System.out.println(arr2d[0][1]);

        for(int i =0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){ // it prints the elements of current row
                System.out.print(arr2d[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
