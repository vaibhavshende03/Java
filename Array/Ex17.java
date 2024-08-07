// write a program to insert an element of an index in the middle

import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50,60};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of index where you want to add the new element.");
        int index=sc.nextInt();

        if(index>0 && index<arr1.length){
            System.out.println("Enter the Element that you want to add:");
            int element=sc.nextInt();

            int[] arr2=new int[arr1.length+1];

            for (int i = 0; i <arr2.length; i++) {

                if(i<index){
                    arr2[i]=arr1[i];
                }
                else if (i==index){
                    arr2[i]=element;
                }
                else {
                    arr2[i]=arr1[i-1];
                }
            }
            System.out.println(Arrays.toString(arr2));
        }

else {
            System.out.println("Index Not found.");
        }
    }

}
