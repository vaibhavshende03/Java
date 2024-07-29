package throws_keyword;

/*
Case 1: Handle Exception Using try-catch block
 */

import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("Device Error");
    }
}

public class Ex2 {

    public static void main(String[] args) {
      try{
          M obj=new M();
          obj.method();
      }
      catch (IOException e){
          System.out.println("Exception Handle");
      }
    }


}
