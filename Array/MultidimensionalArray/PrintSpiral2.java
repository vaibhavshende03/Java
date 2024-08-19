package MultidimensionalArray;

import java.util.Scanner;

public class PrintSpiral2 {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralOrder(int n) {

        int[][] a=new int[n][n];
        int topRow = 0, bottomRow = n- 1, leftColumn = 0, rightColumn = n - 1;
        int currentELement = 1;
        while (currentELement <= n*n) {

            // toprow-->leftcol to rightcol
            for (int j = leftColumn; j <= rightColumn && currentELement <= n*n; j++) {
               a[topRow][j] =currentELement;
                currentELement++;
            }
            topRow++;
            // rightcol-->toprow to bottomrow
            for (int k = topRow; k <= bottomRow && currentELement <= n*n; k++) {
               a[k][rightColumn]=currentELement;
                currentELement++;

            }
            rightColumn--;
            // bottomrow-->rightcol to leftcol
            for (int l = rightColumn; l >= leftColumn && currentELement <= n*n; l--) {
                a[bottomRow][l]=currentELement;
                currentELement++;

            }
            bottomRow--;
            // leftcol-->bottomrow to toprow

            for (int m = bottomRow; m >= topRow && currentELement <= n*n; m--) {
                a[m][leftColumn]=currentELement;
                currentELement++;

            }
            leftColumn++;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
    int[][] ans=generateSpiralOrder(n);
    printArray(ans);


    }

}
