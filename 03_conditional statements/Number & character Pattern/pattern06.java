/*

A
B C
D E F
G H I J
K L M N O
 */

import java.util.Scanner;

public class pattern06
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        char ch='A';
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
