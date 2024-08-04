import java.util.Scanner;

//Search the given element x int the array.If present then return the index else return -1.
public class Ex3 {
    static void searchInArray(int[] arr,int x){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;//break is used for not getting the index of second appearance of element
            }

        }
        System.out.println("The number "+x+" Is Found at the index:"+ans);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int x=sc.nextInt();
        int[] arr={1,4,3,4,2,5};
        searchInArray(arr,x);
    }
}
