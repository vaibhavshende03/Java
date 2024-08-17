package SuffixSum;

import java.util.Arrays;

public class Ex1 {
    public static void makeSuffuxSum(int a[]){
        for (int i = 0; i < a.length; i++) {
            int suffixSum=0;
            for (int j = i; j < a.length; j++) {
                suffixSum+=a[j];
            }
            a[i]=suffixSum;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        makeSuffuxSum(arr);
    }
}
