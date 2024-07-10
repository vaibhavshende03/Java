/*

Pattern :
   1
  2 2
 3   3
4444444

 */

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=(row-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {

                if(i==row||i==1||k==1||k==(2*i-1)){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
