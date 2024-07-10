
/*
Buzz numbers are those numbers that are divisible by seven or end with seven.
 */
import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // n%10==7 mean to check last number is 7 or not
        // n%7==0 mean to check the number is divisible by 7 or not
        if (n % 10 == 7 || n % 7 == 0) {
            System.out.println("The Number is BuzzNumber.");
        } else {
            System.out.println("The Number Is Not Buzz Number.");

        }
        sc.close();
    }
}