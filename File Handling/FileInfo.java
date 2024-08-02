import java.io.File;
//02
public class FileInfo {

    public static void main(String[] args) {
        File F1=new File("myFile.txt");

        if (F1.exists()){
// Getting file name
            System.out.println("The name of the file is :"+F1.getName());
//            Getting the absolutePath of file
            System.out.println("The absolute Path is :"+F1.getAbsolutePath());
//Checking whether the file is writable or not

            System.out.println("file is writable ? :"+F1.canWrite());
            //Checking whether the file is Readable or not

            System.out.println("file is Readable ? :"+F1.canRead());
            // Getting the length of the file in bytes
            System.out.println("the length of the file in bytes :"+F1.length());
        }
        else {
            System.out.println("File Does Not Exists.");
        }
    }
}
