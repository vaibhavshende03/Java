/*

 *********
  *     *
   *   *
    * *
     *
 */

import java.util.Scanner;

public class pattern09 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row=sc.nextInt();

        for (int i = row; i>=1 ; i--) {
            for (int j = i; j <=row ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1); k++) {
                if(i==1||i==row||k==2*i-1||k==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
