import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteData {
    private static final String url="jdbc:mysql://localhost:3306/mydatabase";
    private static final String uname="root";
    private static final String pass="Admin@123";
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e1){
            System.out.println(e1.getMessage());
        }
        try{

            Connection con= DriverManager.getConnection(url,uname,pass);
            Statement stm=con.createStatement();
            int rowsaffected=stm.executeUpdate("delete from employee where id=3;");
            if (rowsaffected>0){
                System.out.println("deleted Successfully."+rowsaffected+" row(s) affected.");
            }
            else {
                System.out.println("Deletion Failed.");

            }
            con.close();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}