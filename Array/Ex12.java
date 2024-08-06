// Write a program to merge two arrays.

public class Ex12 {

    public static void mergeArray(int[] a,int[] b){
        int[] ans= new int[a.length+b.length];
        
        if (a.length==b.length){
            for (int i = 0; i < a.length; i++) {
                ans[i]=a[i];
            }
            //here we initialize "i" starting from the length of first array and continue till the length of ans array
            // and "j" is used as he second array is start from the indexing 0not from i(which takes the value as array1 length).
            for (int i =a.length, j=0; i < ans.length ; i++,j++){
                ans[i]=b[j];
            }
            System.out.println("Merge array:");
            for(int element:ans){
                System.out.println(element);
            }
        }
        else {
            System.out.println("Array indexing is not same.");
        }
    }

    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2={1,2,3,4,5};
        mergeArray(arr1,arr2);
    }


}
