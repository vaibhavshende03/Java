
// Find the sum of digit in giver number

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_num = num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of " + original_num + " is :" + sum);
        sc.close();
    }
}
