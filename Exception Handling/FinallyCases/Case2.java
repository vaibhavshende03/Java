package FinallyCases;


// When there is an exception occur which is handled by the catch block :

/*

 the following example where the Java code throws an exception and the catch block handles the exception.
 Later the finally block is executed after the try-catch block.
 Further, the rest of the code is also executed normally.

 */
public class Case2 {

    public static void main(String[] args) {

        try{
            System.out.println("--------------------------------");

            System.out.println("I am from try block");

            int data=50/0;
            System.out.println(data);
            System.out.println("try block Executed.......");
        }

        catch(ArithmeticException e){
            System.out.println("--------------------------------");
            System.out.println(e);
            System.out.println("I am from catch block...");

            System.out.println("--------------------------------");

        }
        finally {
            System.out.println("I am from finally block.");
            System.out.println("finally block executed......" );
            System.out.println("--------------------------------");

        }

    }

}
