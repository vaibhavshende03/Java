import java.util.Arrays;

//Program to find the frequency of each element in the array
public class Ex26 {

    public static void main(String[] args) {
        int arr[] ={1, 2, 8, 3, 2, 2,8,5,3, 2, 1 };

        int frq[]=new int[arr.length];

        int visited=-1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //as to avoid the count of same element again ,we marked the visited element as -1
                    frq[j] = visited;
                }
//                System.out.println(Arrays.toString(frq));
                if (frq[i] != visited) {
                    frq[i] = count;
                }
            }
        }
            System.out.println("---------------------------------------");
            System.out.println(" Element | Frequency");
            System.out.println("---------------------------------------");
            for (int i = 0; i < frq.length; i++) {
                if(frq[i]!=visited){
                    System.out.println("\t"+arr[i]+"\t | "+"\t\t"+frq[i]);
                }
            }


    }
}
