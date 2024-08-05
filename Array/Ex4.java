// Write a program to find all the even numbers from an array.


public class Ex4 {
public static void evenElementsInArray(int array[]){
    for (int i = 0; i < array.length; i++) {
        if (array[i]%2==0){
            System.out.println("Even Number In Array :"+array[i]);
        }
    }
}

    public static void main(String[] args) {
int[] arr={10,2,8,6,9,7,4,3,1,5};
evenElementsInArray(arr);
    }
}
