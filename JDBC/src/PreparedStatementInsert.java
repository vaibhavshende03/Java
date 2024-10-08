import java.sql.*;
import java.util.Scanner;

public class PreparedStatementInsert {

        private static final String url="jdbc:mysql://localhost:3306/mydatabase";
        private static final String username="root";
        private static final String pass="Admin@123";
        public static void main(String[] args) {
            String query="Insert Into employee(id,name,job_title,salary)Values(?,?,?,?)";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded Successfully.");
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }

            try {
                Scanner sc=new Scanner(System.in);
                int id=sc.nextInt();
                String name= sc.next();
                sc.nextLine();
                String job= sc.nextLine();
                double salary=sc.nextDouble();
                Connection connection= DriverManager.getConnection(url,username,pass);
                System.out.println("Connection Established Succesfully.");

//            Statement statement= connection.createStatement();
                PreparedStatement praparedStatement=connection.prepareStatement(query);
                praparedStatement.setInt(1,id);
                praparedStatement.setString(2,name);
                praparedStatement.setString(3,job);
                praparedStatement.setDouble(4,salary);
//                PreparedStatement praparedStatement=connection.prepareStatement(query);
//                praparedStatement.setInt(1,1);
//                praparedStatement.setString(2,"Krunal");
//                praparedStatement.setString(3,"DevOps Engineer");
//                praparedStatement.setDouble(4,85000);
                int rowsAffected=praparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data Inserted Successfully.");
                }
                else {
                    System.out.println("Data Inserted Failed.");
                }

                praparedStatement.close();
                connection.close();
                System.out.println("Connection Closed Successfully.");
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }



}
