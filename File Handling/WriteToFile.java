//03

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("myFile.txt");
            fw.write("Hello I am writing.....");

        fw.close();
            System.out.println("Content is successfully wrote to the file.");
        }
        catch (IOException e){
            System.out.println("An Unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
