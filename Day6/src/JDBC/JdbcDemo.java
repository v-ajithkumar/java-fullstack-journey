package JDBC;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) throws SQLException {
        read();
    }

    public static void update() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "sql@123";
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Database connection established");

        String query = "update  employee set salary = 5000 where eid = 4";
        Statement stmt = con.createStatement();
        int res = stmt.executeUpdate(query);
        System.out.println("no of rows affected :" + res);
        con.close();
    }

    public static void delete() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "sql@123";
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Database connection established");

        int id = 1;
        String query = "delete from employee where eid = " + id ;
        Statement stmt = con.createStatement();
        int res = stmt.executeUpdate(query);
        System.out.println("no of rows affected :" + res);
        con.close();
    }
    public static void insert() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "sql@123";
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Database connection established");

//        String query = "insert into employee values(4,'arun',50)";
//        Statement stmt =con.createStatement();
//        int res = stmt.executeUpdate(query);
//        System.out.println("no of rows affected : " + res);

        String query = "insert into employee values(?,?,?)";
        PreparedStatement psmt = con.prepareStatement(query);
        psmt.setInt(1,1);
        psmt.setString(2,"Zack");
        psmt.setInt(3,5000);
        int res =  psmt.executeUpdate();
        System.out.println("no of rows affected :" + res);
        con.close();
    }

    public static void read() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "sql@123";
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Database connection established");

        String query = "select * from employee where salary > 2000";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            System.out.println("Id is :" + rs.getInt(1));
            System.out.println("Name is :" +rs.getString(2));
            System.out.println("Salary is :" +rs.getInt(3));
        }

        con.close();
    }

}
