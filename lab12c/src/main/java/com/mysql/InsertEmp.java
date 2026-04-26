//12c. Develop a JDBC project using MySQL to append  the fields empno,  empname and basicsalary into the table Emp of the database Employee by getting the fields  through JSP and Generate the report as follows

CREATE TABLE Emp (
  Emp_NO INTEGER PRIMARY KEY,
  Emp_Name TEXT NOT NULL,
  Basicsalary  INTEGER 
);

-- insert
INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);
INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);
…..
Add 5 records into Emp table of Employee database through Java with JDBC 

and generate a salary report as follows by executing query Emp name starting with R

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No     : 101
Emp_Name: Ramesh'
Basic           : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No     : 102
Emp_Name: Ravi
Basic           : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
….
…

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````





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
