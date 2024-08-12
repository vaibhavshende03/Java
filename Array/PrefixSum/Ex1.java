package PrefixSum;

import java.util.Arrays;

//Given an array "a" ,return the prefix Sums/running sum in the same array without creating a new array.
public class Ex1 {
    static void method1(int a[]){
        int prefixSum=0;
        for (int i = 0; i < a.length; i++) {
            prefixSum+=a[i];
            a[i]=prefixSum;
        }
        System.out.println("Prefix Sum  array:");
        System.out.println(Arrays.toString(a));
    }

    public static int[] method2(int a[]){
            int prefixSum[]=new int[a.length];
        prefixSum[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        int[] a={2,1,3,4,5};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(a));
        method1(a);
        System.out.println(Arrays.toString(method2(a)));//now it will take the method1 array as argument
    }
}
