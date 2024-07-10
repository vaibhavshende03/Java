/*

A B C D E
F G H I
J K L
M N
O
 */

import java.util.Scanner;

public class pattern07
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        char ch='A';
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = n; i>=1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
