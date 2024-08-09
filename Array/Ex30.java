//Program to find 1ts,2nd,3rd Smallest Number in an Array

public class Ex30 {

    public static int firstSmallest(int[] a, int total){
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
        return a[0];
    }

    public static int secondSmallest(int[] a, int total){
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
        return a[1];
    }
    public static int thirdSmallest(int[] a, int total){
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
        return a[2];
    }

    public static void main(String[] args) {
        int[] a={12,56,8,99,4,3,35,79};
        int total=a.length;
        System.out.println("===============");
        System.out.println("1st Smallest :");
        int firstSmallest= firstSmallest(a,total);
        System.out.println(firstSmallest);
        System.out.println("===============");
        System.out.println("2nd Smallest :");
        int secondSmallest = secondSmallest(a,total);
        System.out.println(secondSmallest);
        System.out.println("===============");
        System.out.println("3rd Smallest :");
        int thirdSmallest = thirdSmallest(a,total);
        System.out.println(thirdSmallest);
    }
}
