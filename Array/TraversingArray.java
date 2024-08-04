
class DifferentWays{
    int[] marks={50,60,80,90,99,98,56,80};
void Traversing2DArray(){
    System.out.println("\t\tTravesing 2D Array: ");
    System.out.println("================================");

    int arr[][]={{10,20,30},{60,50,40}};
    System.out.println("Using For loop");
    for(int i=0; i< arr.length;i++){
        for (int j=0;j<=arr.length;j++){
            System.out.println(arr[i][j]);
        }
    }
    System.out.println("================================");
    System.out.println("Using For-Each loop");
    for (int[] elements:arr){           //here we declare 1Darray which stores the values of 2d array in it.
        for(int element:elements){
            System.out.println(element);
        }
    }


}
    void UsingFor(){
        System.out.println("================================");
        System.out.println("\t\tUsing For Loop");
        for(int i=0; i<marks.length;i++){
            System.out.println("AtIndex:"+i+" Marks Is "+marks[i]);
        }
        System.out.println("================================");

    }
    void UsingForEach(){
        System.out.println("================================");
        System.out.println("\t\tUsing For-Each Loop");
        for(int i:marks){
            System.out.println(i);
        }
        System.out.println("================================");

    }
    void UsingWhile(){
        System.out.println("================================");
        System.out.println("\t\tUsing While Loop");
        int i=0;
       while(i<marks.length){
           System.out.println("AtIndex:"+i+" Marks Is "+marks[i]);
           i++;
        }
        System.out.println("================================");

    }

}

public class TraversingArray {
    public static void main(String[] args) {
        DifferentWays obj=new DifferentWays();
obj.UsingFor();
obj.UsingForEach();
obj.UsingWhile();
obj.Traversing2DArray();
    }
}
