//Find the sum of given series 1-2+3-4+5-6+7-8+.................n
//if the number is even then subtract the number
// if the number is odd then add the number

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("The sum is:" + sum);
        sc.close();
    }
}
