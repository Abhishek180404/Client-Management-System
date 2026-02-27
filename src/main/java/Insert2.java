/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abhis
 */
import  java.sql.*;
import java.util.Scanner;

public class Insert2 {
    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employ", "root", "Chandan@2004");

            // Create statement
            Statement stmt = con.createStatement();
            
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of feilds to enter : ");
            int n = sc.nextInt();
            

        for(int i=1 ; i<=n ; i++){      
            System.out.print("Enter Eid : ");
            int Eid=sc.nextInt();
            System.out.print("Enter Did : ");
            int Did=sc.nextInt();
            System.out.print("Enter name : ");
            String name=sc.next();
            System.out.print("Enter Mob : ");
            long phone=sc.nextLong();


            // Prepare SQL query (if using employ table)
            String q =  "insert into EmployID values("+Eid+","+Did+",'"+name+"',"+phone+")";//query





            // Execute update
            int r = stmt.executeUpdate(q);            
           
        }


            // Close connection
            con.close();

            System.out.println("Saved successfully");

        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex);
        }
    }
}

