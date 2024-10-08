import java.sql.*;

public class PreparedStatementsQuery {
    private static final String url="jdbc:mysql://localhost:3306/mydatabase";
    private static final String username="root";
    private static final String pass="Admin@123";
    public static void main(String[] args) {
        String query="select * from employee where name=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            Connection connection=DriverManager.getConnection(url,username,pass);
            System.out.println("Connection Established Succesfully.");

//            Statement statement= connection.createStatement();
            PreparedStatement praparedStatement=connection.prepareStatement(query);
            praparedStatement.setString(1,"Fang Yu");
            ResultSet resultSet=praparedStatement.executeQuery();

            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String job=resultSet.getString("job_title");
                double salary=resultSet.getDouble("salary");
                System.out.println("ID:"+id);
                System.out.println("Name:"+name);
                System.out.println("Job:"+job);
                System.out.println("Salary:"+salary);

            }
            resultSet.close();
            praparedStatement.close();
            connection.close();
            System.out.println("Connection Closed Successfully.");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
