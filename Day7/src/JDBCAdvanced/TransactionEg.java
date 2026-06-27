package JDBCAdvanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionEg {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String uname = "root";
        String password = "sql@123";
        String withdraw = "Update bank set amount = amount - ? where id = ?";
        String deposit = "Update bank set amount = amount + ? where id = ?";

        Connection con = null;

        try{
            con = DriverManager.getConnection(url,uname,password);
            con.setAutoCommit(false);

            PreparedStatement psmt = con.prepareStatement(withdraw);
            PreparedStatement psmt2 = con.prepareStatement(deposit);

            //Withdraw
            psmt.setInt(1,50);
            psmt.setInt(2,1);
            psmt.executeUpdate();

            //artificial exception
            int a = 10 / 0 ;

            //deposit
            psmt2.setInt(1,50);
            psmt2.setInt(2,2);
            psmt2.executeUpdate();

            con.commit();
            System.out.println("Transaction Succesfull");

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction Rolled Back");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }finally {
            try {
                if (con != null)
                    con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
