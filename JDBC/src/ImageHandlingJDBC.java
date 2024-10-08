import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ImageHandlingJDBC {
    private static final String url="jdbc:mysql://localhost:3306/mydatabase";
    private static final String username="root";
    private static final String pass="Admin@123";
    public static void main(String[] args) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("Driver Loaded Successfully.");
                }
                catch (ClassNotFoundException e){
                    e.printStackTrace();
                }

                try {

                    Connection connection= DriverManager.getConnection(url,username,pass);
                    System.out.println("Connection Established Succesfully.");
                    String folder_path="C:\\Users\\shend\\Downloads\\imgDB\\";
//                    String img_path="C:\\Users\\shend\\Downloads\\IONTBO.jpeg";
                    String query="select image_data from image_table where image_id=?";
//                    String query="Insert Into image_table(image_data) values(?)";
//                    FileInputStream fileInputStream=new FileInputStream(img_path);
//                    byte[] image_data=new byte[fileInputStream.available()];
//                    fileInputStream.read(image_data);
//                    PreparedStatement preparedStatement=connection.prepareStatement(query);
//                    preparedStatement.setBytes(1,image_data);
//                    int affectedrows= preparedStatement.executeUpdate();
//                    if (affectedrows>0){
//                        System.out.println("Inserted Successfully");
//                    }
//                    else {
//                        System.out.println("Insertion Failed.");}

                    PreparedStatement preparedStatement=connection.prepareStatement(query);
                    preparedStatement.setInt(1,1);
                    ResultSet resultSet= preparedStatement.executeQuery();
                    if (resultSet.next()){
                        byte[] image_data=resultSet.getBytes("image_data");
                        String img_path_name=folder_path+"extracted.jpeg";
                        OutputStream outputStream=new FileOutputStream(img_path_name);
                        outputStream.write(image_data);
                        System.out.println("Image extracted Successfully.");
                    }
                    else {
                        System.out.println("Image Not Found.");
                    }

                    connection.close();
                    System.out.println("Connection Closed Successfully.");
                }
                catch (SQLException e){
                    e.printStackTrace();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


    }
}
