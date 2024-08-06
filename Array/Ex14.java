// Write a program to check if the given array is a palindrome or not.

import java.util.Arrays;

public class Ex14 {

    public static void main(String[] args) {
//        int[] a={1,2,3,4,5,6};
        int[] a={1,3,3,1};
        int[] b=new int[a.length];//making a copy of original array

        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];//storing the original array element to the copy array
        }
        for (int i = 0,j=a.length-1; i < j; i++,j--) {//imp condition to revere the array
          //reverse the original array
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

            /*
            --Dry Run
                               i      j
            i=0,j=5-->temp=1,a[0]=6,a[5]=1
            i=1,j=4-->temp=2,a[1]=5,a[4]=2
            i=2,j=3-->temp=3,a[2]=4,a[3]=3

             */
        }

        for (int i=0;i<a.length;i++){
            if (a[i]!=b[i]){
                System.out.println("the given array is not a  palindrome.");
                break;
            }
            else {
                System.out.println("the given array is a  palindrome.");
                break;
            }

        }
        System.out.println(Arrays.toString(a));

    }
}
