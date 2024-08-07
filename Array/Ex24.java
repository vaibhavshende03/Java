// Write a program to find the second largest element and smallest element in the array without sorting.
public class Ex24 {

    public static void secondLargest(int []arr){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                secmax=max;
                max=arr[i];
            } else if (arr[i]>secmax && arr[i]!=max) {
                secmax=arr[i];
            }
        }
        System.out.println("Maximum:");
        System.out.println(max);
        System.out.println(secmax);
        System.out.println("===========================");

    }

    public static void secondMinimum(int []arr){
        int min=Integer.MAX_VALUE;
        int secMIN=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                secMIN=min;
                min=arr[i];
            } else if (arr[i]<secMIN && arr[i]!=min) {
                secMIN=arr[i];
            }
        }
        System.out.println("Minimum:");
        System.out.println(min);
        System.out.println(secMIN);
        System.out.println("===========================");

    }


    public static void main(String[] args) {
        int[] arr={10,20,15,5,86,48,73};

        secondLargest(arr);
        secondMinimum(arr);
    }
}
