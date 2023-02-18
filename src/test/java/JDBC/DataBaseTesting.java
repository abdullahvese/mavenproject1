package JDBC;

import java.sql.*;

public class DataBaseTesting {
    public static void main(String[] args) throws SQLException {

     String host="localhost";
     String port="3306";

        Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":" +port+"/demo" ,"root","Muhube.123");

        Statement s=con.createStatement();

    ResultSet rs= s.executeQuery("select * from credentials where scenario ='abdullah'");


   while (rs.next()) {
       System.out.println(rs.getString("username"));
       System.out.println(rs.getString("password"));

   }
    }

}
