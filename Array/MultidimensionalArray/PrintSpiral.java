package MultidimensionalArray;

import java.util.Scanner;

public class PrintSpiral {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] a, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftColumn = 0, rightColumn = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {

            // toprow-->leftcol to rightcol
            for (int j = leftColumn; j <= rightColumn && totalElements < r * c; j++) {
                System.out.print(a[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // rightcol-->toprow to bottomrow
            for (int k = topRow; k <= bottomRow && totalElements < r * c; k++) {
                System.out.print(a[k][rightColumn] + " ");
                totalElements++;

            }
            rightColumn--;
            // bottomrow-->rightcol to leftcol
            for (int l = rightColumn; l >= leftColumn && totalElements < r * c; l--) {
                System.out.print(a[bottomRow][l] + " ");
                totalElements++;

            }
            bottomRow--;
            // leftcol-->bottomrow to toprow

            for (int m = bottomRow; m >= topRow && totalElements < r * c; m--) {
                System.out.print(a[m][leftColumn] + " ");
                totalElements++;

            }
            leftColumn++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the matrix value:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        printArray(a);
        System.out.println("Spiral Order Of Matrix:");
        printSpiralOrder(a, r, c);
    }

}
