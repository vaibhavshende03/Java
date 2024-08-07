// Write a program in which user will give the start and end index and you have to skip those index and print before and after that range.

import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Starting Index:");
        int start= sc.nextByte();
        System.out.println("Enter the Ending Index:");
        int end=sc.nextByte();

        int diff=end-start;

        int[] b=new int[a.length-diff];

        for (int i = 0; i <a.length; i++) {
            if (i<start){
                b[i]=a[i];
            } else if (i>=end) {
                b[i-diff]=a[i];
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
