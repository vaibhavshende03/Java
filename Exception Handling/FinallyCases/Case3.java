package FinallyCases;

// When an exception occurr but not handled by the catch block

/*

 In the following example. Here, the code throws an exception however the catch block cannot handle it.
  Despite this, the finally block is executed after the try block and then the program terminates abnormally.

 */

public class Case3 {
    public static void main(String[] args) {
try{
    System.out.println("--------------------------------");
    System.out.println("I am from try block.");
    int data=50/0;
    System.out.println(data);
    System.out.println("--------------------------------");

}
catch(NullPointerException e){
    System.out.println("--------------------------------");
    System.out.println(e);
    System.out.println("I am from catch block...");

    System.out.println("--------------------------------");

}
finally {
    System.out.println("I am from finally block and block executed.......");
}
    }
}
