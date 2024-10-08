import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BatchProcessingJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String username = "root";
    private static final String pass = "Admin@123";

    public static void main(String[] args) {
        String query = "Insert Into employee(id,name,job_title,salary)Values(?,?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {

            Connection connection = DriverManager.getConnection(url, username, pass);
            System.out.println("Connection Established Succesfully.");
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            connection.setAutoCommit(false);
            Scanner sc= new Scanner(System.in);
            while (true){
                System.out.println("Enter Id:");
                int id= sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the name:");
                String name=sc.nextLine();

                System.out.println("Enter the job_title:");
                String jb=sc.nextLine();

                System.out.println("Enter the salary:");
                double salary= sc.nextDouble();

                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,name);
                preparedStatement.setString(3,jb);
                preparedStatement.setDouble(4,salary);
                preparedStatement.addBatch();
                System.out.println("Add more values(Y/N):");
                String decision=sc.next();

                if(decision.toUpperCase().equals("N")){
                    break;
                }

            }

            int[] batchResult= preparedStatement.executeBatch();
            connection.commit();
            System.out.println("Batch Execute Successfully.");


            connection.close();
            System.out.println("Connection Closed Successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }

    }
}
