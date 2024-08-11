//the given array of integer arr,moves all the given integer at the beginning of the array followed by all the odd integer.
//The relative order of interger does not matter.return any array that satisfies the condition.

import java.util.Arrays;
import java.util.Scanner;
public class Ex32SwapParity {
static void swapParity(int[] arr) {
    int n = arr.length;
    int left = 0;
    int right = n-1;

    while (left < right) {
        if (arr[left] % 2 == 1 && arr[right]%2== 0) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        if ((arr[left] % 2) == 0) {
            left++;
        }
        if ((arr[right] % 2) == 1) {
            right--;

        }
    }

}
static void printArray(int[] arr){
    for (int i=0;i< arr.length;i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println();
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
    int size=sc.nextInt();

        int[] arr=new int[size];
                for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Sorted array:");
        swapParity(arr);
        printArray(arr);
    }
}
