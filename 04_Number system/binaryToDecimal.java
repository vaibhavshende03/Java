import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_number = sc.nextInt();
        int ans = 0;// Converted to decimal
        int pw = 1;// 2^0=1 power of 2

        while (binary_number > 0) {
            int unit_digit = binary_number % 10;
            ans += (unit_digit * pw);
            binary_number /= 10;
            pw *= 2;
        }
        System.out.println(ans);
        sc.close();
    }

}