package MultidimensionalArray;

public class ClockAnticlockRotation {




        public static void printArray(int[][] arr) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void reverseMatrixRow(int[] arr) {

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        public static void transposeMatrix(int[][] arr) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr[i].length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }

            }
        }

        public static void clockwiseRotation(int[][] arr) {
            transposeMatrix(arr);
            for (int i = 0; i < arr.length; i++) {
                reverseMatrixRow(arr[i]);
            }

        }

        public static void antiClockwiseRotation(int[][] arr) {

            for (int i = 0; i < arr.length; i++) {
                reverseMatrixRow(arr[i]);
            }
            transposeMatrix(arr);

        }

        public static void main(String[] args) {

            int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            System.out.println("-----------------------------------------");

            printArray(arr);
            System.out.println("-----------------------------------------");

            clockwiseRotation(arr);

            printArray(arr);
            System.out.println("-----------------------------------------");
            antiClockwiseRotation(arr);
            printArray(arr);


    }


}
