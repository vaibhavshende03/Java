//Addition of two matrices

import java.util.Arrays;


public class Ex25 {

    public static int[][] additionOfMatrices(int[][] a,int[][] b,int s){

        int[][] c=new int[s][s];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }

        }
        return  c;
    }
public static void printMatrix(int[][] mat,int size){
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args){
       int size=3;
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{7,8,9},{4,5,6},{1,2,3}};

        int[][] c=additionOfMatrices(a,b,size);

        System.out.println("====================");
        System.out.println("Matrix A:");
        printMatrix(a,size);
        System.out.println("====================");
        System.out.println("Matrix B:");

        printMatrix(b,size);
        System.out.println("====================");
        System.out.println("Resultant Matrix:");

        printMatrix(c,size);
    }

}
