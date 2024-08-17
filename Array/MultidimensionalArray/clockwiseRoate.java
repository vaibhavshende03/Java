package MultidimensionalArray;
/*
Steps:
1st--> we make its Transposse matrix
2nd we reverse the row of transpose matrix of 2d array
we will get result
 */
public class clockwiseRoate {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    //rotate it 90deg
    static void clockwiseRotate(int[][] a){

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            revesreArray(a[i]);
        }
        printArray(a);
    }
    static void revesreArray(int[] arr){
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
        }

    }



    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Orginal Array:");
        printArray(arr);

        System.out.println("Rotated array(90deg):");
        clockwiseRotate(arr);

    }

}
