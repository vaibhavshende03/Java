//Maximum number from the array

public class Ex2 {

   public static void method1(int[] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (min<array[i]){
                min=array[i];
            }

        }
        System.out.println(min);

    }
    public static void method2(int array[]){
       int ans=0;
       for (int i=0;i<array.length;i++){
           if (array[i]>ans){
               ans=array[i];
           }
       }
        System.out.println("Max:"+ans);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,2,8,10};
        method1(arr);
        method2(arr);
    }
}
