package com.mysql;
import java.sql.*;

public class InsertEmp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee",
                "root",
                "PAVI"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Emp VALUES (?, ?, ?)"
            );

            // Insert 5 records
            Object[][] data = {
                {101, "Ramesh", 25000},
                {102, "Ravi", 20000},
                {103, "Anil", 18000},
                {104, "Raj", 22000},
                {105, "Kiran", 21000}
            };

            for (Object[] emp : data) {
                ps.setInt(1, (int) emp[0]);
                ps.setString(2, (String) emp[1]);
                ps.setInt(3, (int) emp[2]);
                ps.executeUpdate();
            }

            System.out.println("5 Records Inserted Successfully!");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}