package MultidimensionalArray;

import java.util.Scanner;

public class RectangleSum {

    static int findSum(int[][] mat, int l1, int r1, int l2, int r2) {
        int sum=0;
        for (int i = l1; i <=l2 ; i++) {
            for (int j = r1; j <= r2; j++) {
                sum+=mat[i][j];
            }
        }

return sum;
    }
    static int findSum2(int[][] mat, int l1, int r1, int l2, int r2) {
        int sum=0;
        findPrefixSumMtrix(mat);
        for (int i = l1; i <=l2; i++) {
            //r1-->r2 sum for row i
           if (r1>=1){
               sum+=mat[i][r2]-mat[i][r1-1];
           }
           else {
               sum+=mat[i][r2];
           }
        }
        return sum;
    }

     static void findPrefixSumMtrix(int[][] mat) {
        //Traverse horizontally to calculate row-wise prefix sum
         for (int i = 0; i < mat.length; i++) {
             for (int j = 1; j < mat[i].length; j++) {
                 mat[i][j]+=mat[i][j-1];
             }
         }
    }

    static int findSum3(int[][] mat, int l1, int r1, int l2, int r2) {

        int ans=0;
        int sum=0,up=0,left=0,leftUp=0;
        findPrefixSumMtrixRC(mat);
        sum=mat[l2][r2];
        if (r1>=1)
            left=mat[l2][r1-1];
        if (l1>=1)
            up=mat[l1-1][r2];
        if (l1>=1 && r1>=1)
            leftUp=mat[l1-1][r1 -1];


        ans=sum-up-left+leftUp;
        return ans;
    }

    //calculate row-wise ans column-wise sum
    //matrix[i][j]=sumRectangle((0,0)(i,j))
    static void findPrefixSumMtrixRC(int[][] mat) {
        int r= mat.length;
        int c=mat[0].length;
        //Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat[i][j]+=mat[i][j-1];
            }
        }
        //Traverse vertically to calculate column-wise prefix sum
        for (int j = 0; j< c; j++) {
            for (int i = 1; i < r; i++) {
                mat[i][j]+=mat[i-1][j];
            }
        }
    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of rows and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the rectangle Boundaries:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle Sum: " + findSum(mat,l1,r1,l2,r2));
//        System.out.println("Rectangle Sum: " + findSum2(mat,l1,r1,l2,r2));
        System.out.println("Rectangle Sum: " + findSum3(mat,l1,r1,l2,r2));
    }


}
