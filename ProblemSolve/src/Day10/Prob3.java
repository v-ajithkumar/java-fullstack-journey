package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2 ;
        int col = 2 ;
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] mat3 = new int[row][col];
        System.out.println("Enter ele for mat1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter ele for mat2");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

//        System.out.println(Arrays.deepToString(mat1));
//        System.out.println(Arrays.deepToString(mat2));

        System.out.println("Sum is");
        for(int i=0 ; i<row ; i++){
            for (int j = 0; j < col; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(mat3));
    }
}
