package NestedTryCatchBlock;

/*
example: Here the try block within nested try block (inner try block 2) do not handle the exception.
 The control is then transferred to its parent try block (inner try block 1). If it does not handle the exception,
 then the control is transferred to the main try block (outer try block) where the appropriate catch block handles
 the exception. It is termed as nesting.*/

public class Ex2 {

    public static void main(String[] args) {
            try{
                try{
                    try{
                        int[] a=new int[5];
                        System.out.println(a[6]);
                    }
                    catch (ArithmeticException e){
                        System.out.println(e);
                    }
                }
                catch (ArithmeticException e){
                    System.out.println(e);
                }
            }
            catch (ArrayIndexOutOfBoundsException e3){
                System.out.println(e3);
            }
            catch(Exception e4){
                System.out.println(e4);
            }
    }

}
