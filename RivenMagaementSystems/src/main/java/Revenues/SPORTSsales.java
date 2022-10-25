/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revenues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author dpw82
 */
public class SPORTSsales implements CommonSalesData{
    
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";
    
    private double SportsPrice;
    private String carName;

    public SPORTSsales() {
    }

    public SPORTSsales(double SportsPrice, String carName) {
        this.SportsPrice = SportsPrice;
        this.carName = carName;
    }

    public double getSportsPrice() {
        return SportsPrice;
    }

    public void setSportsPrice(double SportsPrice) {
        this.SportsPrice = SportsPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    

    @Override
    public long totalSales() {
        try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "SELECT (SELECT SUM('SportsPrice') FROM Mercedes) + (SELECT SUM('SportsPrice') FROM BMW) AS 'totalSum'";
         return stmt.executeUpdate(sql);
        } catch (SQLException e) {
         e.printStackTrace();
        }
        
        return 0;
    }
    
}
