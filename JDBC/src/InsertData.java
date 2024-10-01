import java.sql.SQLException;
import java.sql.*;

public class InsertData {
    private static final String url="jdbc:mysql://localhost:3306/mydatabase";
    private static final String username="root";
    private static final String password="8983";
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load successfully.");
        }
        catch (ClassNotFoundException e1){
            System.out.println(e1.getMessage());
        }
        try{

            //establish connection
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection establish successfully.");

            //create statement
            Statement stm=con.createStatement();
            //insert the values
//            stm.executeUpdate("insert into employee(id,name,job_title,salary) values(4,'Alice','web developer',40000.00);");
            //here used int tow stored the result  for rows affected which returns the int value.
           int rowsaffected= stm.executeUpdate("insert into employee(id,name,job_title,salary) values(5,'Fang Yu','Machine learning enginner',120000.00);");
            if (rowsaffected>0){
                System.out.println("Insert Successfully."+rowsaffected+" row(s) affected.");
            }
            else {
                System.out.println("Insertion Failed.");

            }
                con.close();


        }catch(SQLException e1){
                System.out.println(e1.getMessage());
            }
    }
}
