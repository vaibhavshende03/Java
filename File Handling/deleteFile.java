import java.io.File;
import java.io.IOException;

//05
public class deleteFile {

    public static void main(String[] args) {


       try{
           File file=new File("Another.txt");
           if (file.createNewFile()){
               System.out.println("File Created :"+file.getName());
           }
           else {
               System.out.println("File Is Already Exists.");
           }
           System.out.println("---------------------");
           if (file.delete()){
               System.out.println(file.getName()+" Is deleted Successfully.");
           }
           else {
               System.out.println("Unexpected error found in deletion of the file.");
           }
       }
       catch (IOException e){
           System.out.println(e);
           e.printStackTrace();
       }
    }
}
