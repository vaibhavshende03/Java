import java.io.File;
import java.io.IOException;
import java.util.Scanner;


//04
public class ReadFromFile {
    public static void main(String[] args) {
       try{
           File fr=new File("myFile.txt");
           Scanner dataReader=new Scanner(fr);
           while(dataReader.hasNextLine()){
               String fileData=dataReader.nextLine();
               System.out.println(fileData);
           }
           dataReader.close();

       }
       catch (IOException e){
           System.out.println("An exception has occurred!");
           e.printStackTrace();
       }
    }
}
