// Write a program to remove all the even elements of an array

import java.util.Arrays;

public class Ex20 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
int evenCount=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                evenCount++;
            }
        }

        int[] b=new int[a.length-evenCount];

        for (int i=0,j=0;i<a.length;i++){
            if (a[i]%2!=0){
                b[j]=a[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
