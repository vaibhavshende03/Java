package throws_keyword;
import java.io.*;
/*
In case we declare the exception and the exception occurs,
it will be thrown at runtime because throws does not handle the exception.
 */

class O{
    void method()throws IOException{
        throw new IOException("device error");
    }
}

public class Ex4 {

    public static void main(String args[])throws IOException{//declare exception
        O obj=new O();
        obj.method();

        System.out.println("normal flow...");
    }
}
