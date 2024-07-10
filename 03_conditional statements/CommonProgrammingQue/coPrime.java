import java.util.Scanner;

public class coPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int num2 = sc.nextInt();

        int small = num1 < num2 ? num1 : num2;

        while (true) {
            if (num1 % small == 0 && num2 % small == 0) {
                System.out.println("The HCF of " + num1 + " & " + num2 + "is: " + small);
                break;
            }
            small--;
        }

        if (small == 1) {
            System.out.println("The numbers are coprime");

        } else {
            System.out.println("The numbers are not coprime");

        }
        sc.close();
    }
}
