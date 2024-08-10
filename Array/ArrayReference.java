import java.util.Arrays;

public class ArrayReference {


    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void change_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
    }

    static void change_val(int a){
        a=1000;
    }
    public static void main(String[] args) {

        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;
        System.out.println("======================");
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println();

//        Trying to copy arr to arr2
        int arr2[]=arr;//its a reference_copy---->Shallow copy

        System.out.println("======================");
        System.out.println("Copied Array:");
        printArray(arr2);
        System.out.println();

//        Changing the some value of array_2
        arr2[0]=0;
        arr2[1]=0;

        System.out.println("======================");
        System.out.println("Original Array after changing the values of arr2:");
        printArray(arr);
        System.out.println();


        System.out.println("======================");
        System.out.println("Copied Arr2 after changing the values of arr2:");
        printArray(arr2);
        System.out.println();

        System.out.println("======================");
    int a= 5;
    int[] arr3={4,8,9,6,4};
        change_val(a);//pass by value
        System.out.println(a);

        System.out.println("======================");
        printArray(arr3);
        System.out.println();
        change_array(arr3);
        printArray(arr3);
        System.out.println();
        System.out.println("======================");
        System.out.println("DeepCopy :");
int[] arr4={4,8,9,6,3};
printArray(arr4);
int[] arr5=arr4.clone();//deepCopy
        change_array(arr5);
        printArray(arr5);
        int[] arr6= Arrays.copyOf(arr5,3);
        printArray(arr6);

    }
}
