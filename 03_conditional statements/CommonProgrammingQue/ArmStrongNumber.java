/*
 Armstrong number is a number that is equal to the sum of cubes of its digits. 
 */

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt(), sum = 0, lenght = 0;
        for (int i = num; i != 0; i /= 10) {
            lenght++;
        }

        for (int i = num; i != 0; i /= 10) {
            int last_num = i % 10;// Every times i wil change
            int power = 1;

            for (int j = 0; j < lenght; j++) {
                power = power * last_num;
            }
            sum += power;
        }

        if (sum == num) {
            System.out.println("The Number Is Armstrong Number.");
        } else {
            System.out.println("The Number is not a Armstrong Number.");
        }
        sc.close();
    }
}