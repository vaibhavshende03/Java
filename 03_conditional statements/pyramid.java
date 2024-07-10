/*
Pattern :

    *
   ***
  *****
 *******
*********

*/

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){   //traversing over row
            //print (row-i) space
            for (int j = 1; j <= (row-i); j++) {
                System.out.print(" ");
            }
            //print (2*i-1)
            for (int k = 1; k <=(2*i-1) ; k++) { // traversing over *
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
