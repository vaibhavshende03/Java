package try_catch;

public class Example1 {

    public static void main(String[] args) {
        try{
            System.out.println("I a from try Block");
            int data=50/0;
            System.out.println("I a from try Block");
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Catch Block Executed...");
        }
    }
}
