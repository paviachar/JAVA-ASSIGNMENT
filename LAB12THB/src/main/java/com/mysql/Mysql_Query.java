//12b. Read all the existing records from the table coffee which is from the database test and query coffee name starting with ‘D’   in the table.




package com.mysql;

import java.sql.*;
import java.util.Properties;

public class Mysql_Query
{
  public static void main(String[] args)
  {
    Connection dbConnection = null;

    try
    {
        String url = "jdbc:mysql://localhost/test";
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "PAVI");

        dbConnection = DriverManager.getConnection(url, info);

        if (dbConnection != null)
        {
            System.out.println("Successfully connected to MySQL database test");
        }

        // SQL SELECT query
        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";

        Statement st = dbConnection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next())
        {
            int id = rs.getInt("id");
            String coffee_name = rs.getString("coffee_name");
            int price = rs.getInt("price");

            System.out.format("\n%d  %s  %d", id, coffee_name, price);
        }

        rs.close();
        st.close();
        dbConnection.close();
    }
    catch (Exception e)
    {
        System.err.println("Got an exception!");
        e.printStackTrace();
    }
  }
}
