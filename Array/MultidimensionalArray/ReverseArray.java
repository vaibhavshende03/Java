package MultidimensionalArray;
//reverse row
public class ReverseArray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        int a[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        System.out.println("Original Array:");
printArray(a);
        for (int i = 0; i < a.length; i++) {
                      int start=0,end=a.length;
                      while (start<end){
                          int temp=a[i][start];
                          a[i][start]=a[i][end];
                          a[i][end]=temp;

                          start++;
                          end--;
                      }
        }

        System.out.println("Reverse Array:");
        printArray(a);
    }
}
