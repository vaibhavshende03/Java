import java.sql.*;

public class TransactionHandling {


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
                String withdrawQ="Update accounts set balance=balance- ? where  account_number=?";
                String depositQ="Update accounts set balance=balance+ ? where account_number=?";

                Connection con= DriverManager.getConnection(url,username,password);
                System.out.println("Connection establish Successfully.");

                con.setAutoCommit(false);
                try {
                    PreparedStatement withdrawStatement = con.prepareStatement(withdrawQ);
                    PreparedStatement depositeStatement = con.prepareStatement(depositQ);

                    withdrawStatement.setDouble(1, 300);
                    withdrawStatement.setString(2, "acc456");
                    depositeStatement.setDouble(1, 300);
                    depositeStatement.setString(2, "acc789");

                    int rowsAffectedWithdraw=withdrawStatement.executeUpdate();
                    int rowsAffectedDeposite=depositeStatement.executeUpdate();
                    if (rowsAffectedWithdraw>0 && rowsAffectedDeposite>0) {
                        con.commit();
                        System.out.println("Transaction Successful! ");
                    }
                    else {
                        con.rollback();
                        System.out.println("Transaction failed.");
                    }
                }
                catch (SQLException e){
                   e.printStackTrace();
                }
                con.close();
                System.out.println("Connection Closed Successfully.");
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }


}
