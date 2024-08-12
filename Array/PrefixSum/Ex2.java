package PrefixSum;

import java.util.Scanner;

//Given an array of integer of size N.
// Answer the q queries  you need to print a sum of values in a given range of indices, from 1 to r(both included)
// Note, the value of l and r in queries follow 1-based indexing
public class Ex2 {
    public static int[] prefixSum(int a[]){
        for (int i = 1; i < a.length; i++) {
            a[i]+=a[i-1];
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i < arr.length; i++) {
            System.out.println("Enter the " + (i) + " element:");
            arr[i] = sc.nextInt();
        }
        int prefix[]=prefixSum(arr);
        System.out.println("Enter the number of queries:");
        int q=sc.nextInt();

        while(q-- >0){
            System.out.println("Enter the range:");
            int l=sc.nextInt();
           int  r=sc.nextInt();

           int ans=prefix[r]-prefix[l-1];
            System.out.println("Sum:"+ans);

        }


    }

}
