
//Given 2 Number a and b. Find a raise to the power b

import java.util.Scanner;

public class raiseToPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers :");
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 1;
        System.out.print("The " + a + "^" + b + " is :");
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(ans);
        sc.close();
    }
}
