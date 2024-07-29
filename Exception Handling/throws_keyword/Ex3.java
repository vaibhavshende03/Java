package throws_keyword;
/*
In case we declare the exception, if exception does not occur, the code will be executed fine.
 */

import java.io.IOException;

class N{
    void method()throws IOException{
        System.out.println("device operation performed");
    }
}
public class Ex3 {

    public static void main(String args[])throws IOException{//declare exception
        N obj=new N();
        obj.method();

        System.out.println("normal flow...");
    }
}
