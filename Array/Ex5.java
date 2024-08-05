// Find the sum of even and odd elements of an given array.

public class Ex5 {
    public static void main(String[] args) {
        int sumEven=0,sumOdd=0;
        int[] arr={10,9,8,6,5,4,7,1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sumEven+=arr[i];
            }
            else {
                sumOdd+=arr[i];
            }
        }
        System.out.println("=====================================");
        System.out.println("The sum of even number is: "+sumEven);
        System.out.println("=====================================");
        System.out.println("The sum of odd number is: "+sumOdd);
    }
}
