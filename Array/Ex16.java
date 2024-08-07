// Write a program to enter a new element at the last of an array.

import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b=new int[a.length+1];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            b[i]=a[i];
        }
        System.out.println("Enter the  element you want to add at last:-");
        b[b.length-1]=sc.nextInt();
        System.out.println(Arrays.toString(b));

    }
}
