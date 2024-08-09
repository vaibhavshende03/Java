//Program to sort the elements of an array in ascending order

public class Ex28 {

    public static void main(String[] args) {
        int[] a={1,5,6,9,8,4};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {

                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int element:a){
            System.out.println(element);
        }
    }

}
