// Write a program to print all the +ve and -ve elements of an array.


public class Ex9 {
    public static void positiveElement(int arr[]){
        System.out.println("================");
        System.out.println("Positive Elements :");
        for(int i=0;i<arr.length;i++){

            if (arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void negativeElement(int arr[]){
        System.out.println("================");
        System.out.println("Negative Elements :");
        for(int i=0;i<arr.length;i++){

            if (arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] array={1,2,-3,4,5,-6,7,8,-9,10};
        positiveElement(array);
        negativeElement(array);
    }
}
