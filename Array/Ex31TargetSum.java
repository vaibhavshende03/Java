//Find the total number of pairs in the array whose sum is equal to the given value x(target)

public class Ex31TargetSum {

    public static void tripletSum(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if ((arr[i]+arr[j]+arr[k])==target){
                        count++;
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                }
            }
        }
        System.out.println("There are "+count+" triplet are avilable");
    }



    public static void targetSum(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i]+arr[j])==target){
                    count++;
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println("There are "+count+" pair are avilable");
    }





    public static void main(String[] args) {

        int[] arr={4,6,3,5,8,2};
    targetSum(arr,7);
        System.out.println("=====================");
        tripletSum(arr,20);
        tripletSum(arr,12);

    }

}

