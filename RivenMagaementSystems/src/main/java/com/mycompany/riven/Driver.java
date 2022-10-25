/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.riven;


import java.sql.*;
/**
 *
 * @author dpw82
 */
public class Driver {
    
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      }
    }
    
}
