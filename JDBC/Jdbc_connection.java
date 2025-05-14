package JDBC;

import java.sql.*;

public class Jdbc_connection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = DriverManager.getConnection(url,"ashutoshyadav","");
        Statement st = con.createStatement();

    /*
        int res = st.executeUpdate(query)
     */



        ResultSet res = st.executeQuery("select * from users");

        while (res.next()) {
            System.out.println(res.getString(1) + " " + res.getString(2) + " " + res.getString(3));
        }
    }
}
