/*
Pattern :

1212121212
2121212121
1212121212
2121212121
1212121212

*/
import java.util.Scanner;

public class Pattern09{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Number :");
        int row = sc.nextInt();
        System.out.println("Enter The column Number :");
        int col = sc.nextInt();

        for(int i=1;i<=row;i++){
            for (int j = 1; j <= col; j++) {
               if((i+j)%2==0){
                   System.out.print("1");
               }
               else {
                   System.out.print("2");
               }
            }

            System.out.println();
        }
        sc.close();
    }
}
