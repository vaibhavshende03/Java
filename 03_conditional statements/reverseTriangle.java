/* 
Pattern :

*****
****
***
**

 */

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row + 1 - i); j++) { // Relation(row + 1 -i)
                System.out.print("*");
            }
            System.out.println();
        }

        // Another
System.out.println("------------------");
        for (int i = row; i>= 1; i--) {
            for (int j = 1; j <=  i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
