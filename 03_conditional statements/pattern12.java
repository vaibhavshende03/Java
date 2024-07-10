/*
Pattern :

AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

* */

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                char ch = (char) ('A' + i - 1);
                System.out.print(ch);

            }
            System.out.println();
        }
        sc.close();
    }

}
