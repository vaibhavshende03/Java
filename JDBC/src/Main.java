import java.sql.*;
public class Main {
    private static final String url="jdbc:mysql://localhost:3306/mydatabase";
    private static final String username="root";
    private static final String password="Admin@123";

    public static void main(String[] args) throws ClassNotFoundException {

        try{
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load successfully.");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection establish Successfully.");
            Statement stm=con.createStatement();
            ResultSet rs= stm.executeQuery("select * from employee;");
            while(rs.next()){
               /*
               int id=rs.getInt("Id");
               String name=rs.getString("name");
               String job_title=rs.getString("job_title");
               Double salary=rs.getDouble("salary");
               System.out.println("Id:"+id);
               System.out.println("name:"+name);
               System.out.println("job_title:"+job_title);
               System.out.println("Salary:"+salary);
               System.out.println();

                */
                System.out.println("==========================");
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("job_title")+" "+rs.getDouble("salary"));
            }
            rs.close();
            stm.close();
            con.close();
            System.out.println("Connection Closed Successfully.");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}