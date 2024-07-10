import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }

        if (reverse == num) {
            System.out.println("Number Is Palindrome.");
        } else {
            System.out.println("Number is not Palindrome.");
        }
        sc.close();
    }
}
