import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_number = sc.nextInt();
        int ans = 0;// Converted to decimal
        int pw = 1;// power of 10

        while (decimal_number > 0) {
            int parity = decimal_number % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal_number /= 2;

        }
        System.out.println(ans);
        sc.close();
    }

}
