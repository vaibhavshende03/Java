// Write a program to print the elements of an array in reverse order.

public class Ex6 {
    public static void revesre(int[] arr){
        for (int i=arr.length;i>0;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
int[] array={1,2,3,4,5,6,7,8,9,10};
revesre(array);
    }
}
