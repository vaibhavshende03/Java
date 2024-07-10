/*

Pyramid Star Pattern :
    *
   * *
  *   *
 *     *
*********

 */

import java.util.Scanner;

public class pattern08 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row=sc.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=(row-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                if(i==1||i==row||k ==(2*i-1)||k==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
