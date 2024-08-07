// Write a program to find largest element and smallest element in the array without sorting.

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Ex23 {

public static void minValue(int[] arr){

    int min=Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i]<min){
            min=arr[i];

        }
    }
    System.out.println("The smallest Value is:"+min);
}


    public static void maxValue(int[] arr){

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("The largest Value is:"+max);
    }

    public static void main(String[] args) {
        int[] a={10,20,30,5,6,40,89,36,74};

        minValue(a);
        maxValue(a);
    }
}
