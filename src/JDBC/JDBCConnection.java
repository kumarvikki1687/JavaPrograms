package JDBC;

import java.sql.*;

class JDBCConnection {
    public static void main(String[] args) throws SQLException {

        // create connection using DriverManager
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access_control"
                , "root", "password");

        // create statement using connection
        Statement stmt = con.createStatement();

        String query = "select * from user limit 3";

        // execute query using statement and store it in result set
        ResultSet output = stmt.executeQuery(query);

        System.out.println();
        while (output.next()) {
            System.out.println("ID: " + output.getString("id") + ", email: " +
                    output.getString("email"));
        }
        // close connection
        con.close();
    }
}