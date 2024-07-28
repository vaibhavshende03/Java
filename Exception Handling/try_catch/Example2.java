package try_catch;

public class Example2 {
    public static void main(String[] args) {

        try{
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }

    }
}
