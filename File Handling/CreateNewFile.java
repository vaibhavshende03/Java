import java.io.File;
import java.io.IOException;
//01
public class CreateNewFile {
    public static void main(String[] args){
        File F1=new File("myFile.txt");
/*
createNewFile() method returns:
-->true, if file is created
-->False, if file is already exists.
 */
        try {
            if (F1.createNewFile()){
                System.out.println("File Created :"+F1.getName());
            }
            else {
                System.out.println("File Is Already Exists.");
            }
        }
        catch (IOException e){
            System.out.println(e);
            System.out.println("An Error Has Occurred.");
            e.printStackTrace();
        }
//        System.out.println(F1.getName()); //getName is used to find the file name.
    }

}
