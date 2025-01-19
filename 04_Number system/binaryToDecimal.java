import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNum = sc.nextInt();
        int decimalNum = 0;

        int base = 1;
        while(binaryNum>0)
        {
            int lastDigit = binaryNum % 10;
            binaryNum = binaryNum / 10;
            decimalNum += lastDigit * base;
            base = base * 2;
        }

        System.out.println(decimalNum);
        sc.close();
    }

}