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
public class CARsales {
    
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";
    
    private int VIN;
    private String make;
    private String model;
    private double Price;
    private boolean warranty;

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public CARsales() {
    }

    public CARsales(double Price, String carName) {
        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.warranty = warranty;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getCarName() {
        return make;
    }

    public void setCarName(String carName) {
        this.make = carName;
    }
      
    public long totalSales() {
        try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "SELECT (SELECT SUM('Price') FROM Mercedes) + (SELECT SUM('Price') FROM BMW) AS 'totalSum'";
         return stmt.executeUpdate(sql);
        } catch (SQLException e) {
         e.printStackTrace();
        }
        
        return 0;
    }
    
}
