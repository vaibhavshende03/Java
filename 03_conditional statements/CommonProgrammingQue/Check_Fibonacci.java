import java.util.Scanner;

public class Check_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0, n2 = 1;

        for (;;) {
            if (num == n1 || num == n2) {
                System.out.println("The Number is Fibonacci.");
                break;
            }

            else if (n1 > num) {
                System.out.println("It is not a fibonacci number");
                break;
            } else {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
        sc.close();

    }
}