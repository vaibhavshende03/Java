package MultidimensionalArray;

import java.util.Scanner;

public class additionOfTwoMatrices {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void add(int a[][],int r1,int c1, int b[][],int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input addition not possible(Wrong dimension).");
            return;
        }
        else {
            int[][] sum=new int[r1][c1];
            for (int i = 0; i <r1 ; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("Sum Matrix:");
            printArray(sum);
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

            add(a,r1,c1,b,r2,c2);

        }
    }

