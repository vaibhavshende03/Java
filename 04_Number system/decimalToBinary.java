import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        int binaryNumber = 0;
        int base = 1;
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber += remainder * base;
            decimalNumber = decimalNumber / 2;
            base = base * 10;
        }
        System.out.println(binaryNumber);

        sc.close();
    }

}
