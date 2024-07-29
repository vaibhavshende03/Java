package throw_keyword;

public class Ex3 {

    public static void main(String[] args) {
        try{
            throw new UserDefinedException("This is User-Defined Exception");
        }
        catch (UserDefinedException ude){
            System.out.println("Catch the Exception");
            System.out.println(ude.getMessage());
        }
    }
}

class UserDefinedException extends Exception{
   public UserDefinedException(String str){
        super(str);
    }
}
