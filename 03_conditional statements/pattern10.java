/*
Pattern :

   1
  121
 12321
1234321

*/

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){   //traversing over row
            //print (row-i) space
            for (int j = 1; j <= (row-i); j++) {
                System.out.print(" ");
            }
            //print (1--->i)
            for (int k = 1; k <=i ; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l>0 ; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }

}
