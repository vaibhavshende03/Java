// Write a program to remove all the occurance of an element...

import java.util.Arrays;

public class Ex21 {
    public static void main(String[] args) {
        int a[]={1,2,2,2,3,4,5,6,7};
        int element=2;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==element){
                count++;
            }
        }
        int b[]=new int[a.length-count];

        for(int i=0,j=0;i<a.length;i++){
            if (a[i]!=element){
                b[j]=a[i];
                j++;
            }


        }
        System.out.println(Arrays.toString(b));
    }
}
