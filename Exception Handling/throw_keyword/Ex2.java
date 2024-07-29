package throw_keyword;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2 {

    public static void method() throws FileNotFoundException {
        FileReader f=new FileReader("abc.txt");
        BufferedReader fileInput=new BufferedReader(f);

        throw  new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            method();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
