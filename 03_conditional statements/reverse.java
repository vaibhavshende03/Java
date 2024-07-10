
// Reverse the digit of numbers
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int remainder = 0, reverse = 0;
        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        System.out.println("The revesre Number is :" + reverse);
        sc.close();
    }
}
