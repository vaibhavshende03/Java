package MultidimensionalArray;

import java.util.Scanner;

public class MultiplicationOfArray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
/*
In multiplication of matrix the number of columns of matrix1(c1) is equal to the number of rows of matrix2(r2) then,
 we can perform matrix multiplication.

 The resultant matrix is the size of
  rows-->the numbers of column of matrix A
  column-->the number of rows of matrix B
  i.e.-->r1Xc2


 */
    static void multiplication(int a[][],int r1,int c1, int b[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong Input Multiplication not possible(Wrong dimension).");
            return;
        }
        else {
            int[][] mul=new int[r1][c2];
            for (int i = 0; i <r1 ; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        mul[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Multiplication Matrix:");
            printArray(mul);
        }

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix A:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the values of matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of matrix B:");
        int r2= sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter the values of matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        printArray(a);
        System.out.println("Matrix B:");
        printArray(b);

        multiplication(a,r1,c1,b,r2,c2);

    }


}
