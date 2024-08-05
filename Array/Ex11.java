// Write a program to print first element of first array should be last element of second array(Duplicate array with reverse elements)

public class Ex11 {
    public static void main(String[] args) {
        int[] arr ={10,5,9,6,3,7,8,4,2,80,90,70};
        int[] copyArray=new int[arr.length];

        for (int i=0;i< arr.length;i++){
            //this condition is used to store the main array element in revesre order to the copy array
            copyArray[arr.length-1-i]=arr[i];
        }
        for (int i:copyArray){
            System.out.println(i);
        }

        System.out.println("==============");
        System.out.println("The first element of the main array :"+arr[0]+"\n"+"The last element of the copy array :"+copyArray[copyArray.length-1]);
    }
}
