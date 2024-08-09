//Program to find 1ts,2nd,3rd Largest Number in an Array

public class Ex29 {

    public static int firstLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i+1; j < total; j++) {
               if(a[i]>a[j]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
            }

        }
        return a[total-1];
    }

    public static int secondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i+1; j < total; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        return a[total-2];
    }
    public static int thirdLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i+1; j < total; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        return a[total-3];
    }

    public static void main(String[] args) {
        int[] a={12,56,8,99,4,3,35,79};
        int total=a.length;
        System.out.println("===============");
        System.out.println("1st Largest :");
        int firstLargest=firstLargest(a,total);
        System.out.println(firstLargest);
        System.out.println("===============");
        System.out.println("2nd Largest :");
        int secLargest=secondLargest(a,total);
        System.out.println(secLargest);
        System.out.println("===============");
        System.out.println("3rd Largest :");
        int thirdLargest=thirdLargest(a,total);
        System.out.println(thirdLargest);
    }
}
