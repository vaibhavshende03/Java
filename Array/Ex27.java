//Program to print the duplicate elements of an array

public class Ex27 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,6,7,8,9,4,2,3,1};

        System.out.println("Duplicates elements in array are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }

}
