/*
Left triangle star pattern :
    *
   **
  ***
 ****
*****
 */

import java.util.Scanner;

public class pattern02 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row=sc.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=(row-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
