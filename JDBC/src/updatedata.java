import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedata {
    private static final String url="jdbc:mysql://localhost:3306/mydatabase";
    private static final String username="root";
    private static final String password="Admin@123";

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con= DriverManager.getConnection(url,username,password);
            Statement stm=con.createStatement();
            int rowsaffected= stm.executeUpdate("update employee set job_title='Full stack Developer',salary=80000 where id=2;");
            if (rowsaffected>0){
                System.out.println("Update Successful. "+rowsaffected+" row(s) affected.");
            }
            else {
                System.out.println("Update Failed!");
            }

        }
        catch (SQLException e1){
            System.out.println(e1.getMessage());
        }
    }
}