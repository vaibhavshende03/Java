package throw_keyword;

/*
In this example, we have created the validate method that takes integer value as a parameter.
If the age is less than 18, we are throwing the ArithmeticException otherwise print a message welcome to vote.
 */

public class Ex1 {

    public static void validate(int age){
        if (age<18){
            throw new ArithmeticException("Person is Not Eligible For Voting");
        }
        else{
            System.out.println("Person is Eligible For Voting");
        }
    }

public static void main(String[] args){
    System.out.println("----------------------------------");
    validate(20);
    System.out.println("----------------------------------");
    validate(15);//exception
    System.out.println("----------------------------------");
    validate(22);
    System.out.println("----------------------------------");

}
}
