// Write a program to reverse an array without taking new array. You have to reverse within same array.

public class Ex13 {

    public static void arrayRevesre(int[] a) {
        for (int i = 0,j=a.length-1; i <j ; i++,j--) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.print("[");
        for (int element:a){
            System.out.print(element+",");
        }
        System.out.print("]");

    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        arrayRevesre(arr);
    }

}
