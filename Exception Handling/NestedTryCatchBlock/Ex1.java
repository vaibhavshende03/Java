package NestedTryCatchBlock;

// example where we place a try block within another try block for two different exceptions.

/*

When any try block does not have a catch block for a particular exception,
then the catch block of the outer (parent) try block are checked for that exception,
and if it matches, the catch block of outer try block is executed.

If none of the catch block specified in the code is unable to handle the exception,
then the Java runtime system will handle the exception.
Then it displays the system generated message for that exception.
 */

public class Ex1 {

    public static void main(String[] args) {
        //outer try block
try {
    //inner try block1

    try{
        System.out.println("Dividing by Zero");
        System.out.println(40/0);
    }
    //catch block of inner try block 1
    catch (ArithmeticException e1){
        System.out.println(e1);
    }

//    inner try block 2

    try{
        int[] arr=new int[5];
        arr[8]=8;
        System.out.println(arr);
    }
    catch (ArrayIndexOutOfBoundsException e2){
        System.out.println(e2);
    }
}
catch (Exception e){
    System.out.println("handled the exception (outer catch)");
    System.out.println(e);
}
        System.out.println("normal flow..");

    }
}
