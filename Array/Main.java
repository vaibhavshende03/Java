
class ArrayExample{
    void oneDimensional(){

//        int a[]={33,3,4,5};//declaration, instantiation and initialization
        System.out.println("=================================");
        System.out.println("\t\tOne Dimesional Array.");
        int[] ages=new int[3];
        float[] weight=new float[3];
        String[] names=new String[3];
        System.out.println("=================================");
        ages[0]=15;
        ages[1]=20;
        ages[2]=22;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println("=================================");

        weight[0]=30.50f;
        weight[1]=40.60f;
        weight[2]=45.80f;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println("=================================");

        names[0]="James";
        names[1]="Harry";
        names[2]="John";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("=================================");
        System.out.println("Array Length :");
        System.out.println(ages.length);
        System.out.println(weight.length);
        System.out.println(names.length);
        System.out.println("=================================");

    }
    void twoDimensional(){
        System.out.println("\t\tTwo Dimensional Array.");
        System.out.println("=================================");

//        int[][] arr=new int[5][3];
//        arr[0][0]=5;

        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][2]);


        System.out.println("=================================");

    }


}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj=new ArrayExample();
        obj.oneDimensional();
        obj.twoDimensional();
    }
}