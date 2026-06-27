package JDBCAdvanced;

import java.sql.*;

public class StoredProcedureEg {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String uname = "root";
        String password = "sql@123";
        Connection con = DriverManager.getConnection(url,uname,password);

        CallableStatement cs = con.prepareCall("{call getUserDetailsById(?)}");
        int id = 3;
        cs.setInt(1,id);
        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            System.out.println("id : " + rs.getInt(1));
            System.out.println("name : " + rs.getString(2));
            System.out.println("salary : " + rs.getInt(3));
        }
    }
}
