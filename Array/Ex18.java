// Write a program to remove an element from an array.

import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50,60};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of index where you want to remove the new element.");
        int index=sc.nextInt();

        if(index>0 && index<arr1.length){


            int[] arr2=new int[arr1.length-1];

            for (int i = 0; i <arr1.length; i++) {

                if(i<index){
                    arr2[i]=arr1[i];
                }

                else {
                    arr2[i-1]=arr1[i];
                }
            }
            System.out.println(Arrays.toString(arr2));
        }

        else {
            System.out.println("Index Not found.");
        }
    }

}
