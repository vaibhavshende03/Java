
//count the number of digits for given number
import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int orignal_num = n;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("The number of digit in " + orignal_num + "=" + count);
        sc.close();
    }
}
