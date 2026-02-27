/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abhis
 */
import java.sql.*;
public class Insert {
    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/info", "root", "Chandan@2004");

            // Create statement
            Statement stmt = con.createStatement();

            // Prepare SQL query (if using employ table)
            String q = "insert into employ values(6,'Nayan',60000,7987989553)";

            // Execute update
            int r = stmt.executeUpdate(q);

            // Close connection
            con.close();

            System.out.println("Saved successfully");

        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex);
        }
    }
}