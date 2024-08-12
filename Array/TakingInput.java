import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("The empty array:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the "+(i+1)+" element:");
            arr[i]= sc.nextInt();
        }

        System.out.println("Array after taking input:");
        System.out.println(Arrays.toString(arr));

    }


}
