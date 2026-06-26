package JDBC;

import java.io.*;
import java.sql.*;

public class TryWithResource {
    public static void main(String[] args) throws  SQLException {
//        File f = new File("abcd.txt");
//        FileReader fr = new FileReader(f);
//
//        try (BufferedReader br = new BufferedReader(fr)){
//           int ch =  br.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "sql@123";
        String query = "select * from employee where salary > 2000";
        try( Connection con = DriverManager.getConnection(url,username,password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);
        ) {
            System.out.println("Database connection established");
            while (rs.next()) {
                System.out.println("Id is :" + rs.getInt(1));
                System.out.println("Name is :" + rs.getString(2));
                System.out.println("Salary is :" + rs.getInt(3));
            }
        }
    }
}
