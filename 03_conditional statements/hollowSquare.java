/*

Pattern :
 ******
 *    *
 *    *
 ****** 
 
 */

import java.util.Scanner;

public class hollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();
        System.out.println("Enter The column Number :");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
