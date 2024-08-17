package MultidimensionalArray;

public class TransposeMatrix {


    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
//using extra matrix
    static void tmat(int[][] arr){
        int r= arr.length;
        int col=arr.length;
        int[][] ans=new int[r][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ans[i][j]=arr[j][i];
            }
        }
        printArray(ans);

    }

    //transpose in-place
    static void inPlaceTranspose(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
            }
        }
        System.out.println("Using Inplace:");
        printArray(mat);
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Orginal Array:");
        printArray(arr);

        System.out.println("Transpose Matrix:");
//        tmat(arr);
        inPlaceTranspose(arr);
    }
}
