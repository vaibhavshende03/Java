// Write a program to copy all the elements of one array into another array..

public class Ex10 {
    public static void main(String[] args) {
        int[] arr ={10,5,9,6,3,7,8,4,2};
        int[] copyArray=new int[arr.length];

        for (int i=0;i< arr.length;i++){
            copyArray[i]=arr[i];
        }
        for (int i:copyArray){
            System.out.println(i);
        }
    }
}
