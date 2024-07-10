/*
Pattern :

        123456
        123456
        123456
        123456
*/
import java.util.Scanner;

public class pattern08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();
        System.out.println("Enter The column Number :");
        int col = sc.nextInt();

        for(int i=1;i<=row;i++){

            for (int j = 1; j <= col; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
        sc.close();
    }
}
