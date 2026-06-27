package JDBCAdvanced;

import java.sql.*;

public class BatchProcessingEg {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String uname = "root";
        String password = "sql@123";
        String query = "insert into bank values(3,'zack',500)";
        String query2 ="insert into bank values(4,'Arthur',600)";
        String query3 ="insert into bank values(5,'John',700)";
        String query4 = "insert into bank values(6,'Dutch',800)";

        Connection con = DriverManager.getConnection(url,uname,password);
        Statement stmt = con.createStatement();
        stmt.addBatch(query);
        stmt.addBatch(query2);
        stmt.addBatch(query3);
        stmt.addBatch(query4);
        int[] res =   stmt.executeBatch();
        System.out.println("record inserted : " + res.length);
    }
}
