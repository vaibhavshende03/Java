package throws_keyword;

import java.io.IOException;

public class Ex1 {
    void m() throws IOException{
throw new IOException("Device Error....");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try
        {
            n();

        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception Handle....");
        }
    }

    public static void main(String[] args) {
        Ex1 obj=new Ex1();
        obj.p();
        System.out.println("Normal Flow....");
    }
}
