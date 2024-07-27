package ExceptionTypes;

public class UncheckedException {

    public static void main(String[] args) {

        //ArithmeticException
        System.out.println(4/0);


        //NullPointerException

        String str=Null;
        System.out.println(str.length());


        //ArrayIndexOutOfBoundsException

        int[] arr=new int[5];
        arr[10]=100;// it Throws the ArrayIndexOutOfBoundsException

    }
}
