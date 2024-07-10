/*
Pattern :

12345
23451
34512
45123
51234


*/

import java.util.Scanner;

public class numericRectangular
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){   //traversing over row

            for (int j = i; j <= row; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <=(i-1) ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
