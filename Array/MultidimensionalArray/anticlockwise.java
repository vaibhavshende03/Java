package MultidimensionalArray;

public class anticlockwise {

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    static void antiClockise(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            reverseArray(arr[i]);
        }
        transpose(arr);
        printArray(arr);
    }

    static void transpose(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[] a){
        for (int i = 0,j=a.length-1 ;i <j ; i++,j--) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Orginal Array:");
        printArray(arr);
        System.out.println("Anticlockwise Array:");
        antiClockise(arr);

    }
}

