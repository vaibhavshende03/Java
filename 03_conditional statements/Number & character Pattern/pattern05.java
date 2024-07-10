/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

 */

import java.util.Scanner;
public class pattern05
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
