package FinallyCases;

//When there is no exception occur:

/*
 if no exceptions occur in the try block, the catch block is skipped,
 and the finally block is executed. If an exception occurs in the try block,
  the catch block is executed to handle the exception,
  and the finally block is also executed.
 */

public class Case1 {
    public static void main(String[] args) {

try{
    System.out.println("--------------------------------");
    int temp=50/5;
    System.out.println(temp);
    System.out.println("I am in try Block.... \ntry block executed...!");
    System.out.println("--------------------------------");

}
catch(NullPointerException e){
    System.out.println("--------------------------------");
    System.out.println(e);
    System.out.println("I am from catch block...");
    System.out.println("--------------------------------");


}
finally{
    System.out.println("I am from Finally Block......");
}

    }

}
