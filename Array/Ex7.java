//Write a program to print the alternate values of an array.
public class Ex7 {
    public static void alternativeValues(int[] arr){
        for (int i=1;i<= arr.length;i+=2){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        alternativeValues(array);
    }
}
