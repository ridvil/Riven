/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revenues;

/**
 *
 * @author dpw82
 */
public class SedanSales implements CommonSalesData {
    
    private double sedanPrice;
    private String carName;

    public SedanSales() {
    }

    public SedanSales(double sedanPrice, String carName) {
        this.sedanPrice = sedanPrice;
        this.carName = carName;
    }

    public double getSedanPrice() {
        return sedanPrice;
    }

    public void setSedanPrice(double sedanPrice) {
        this.sedanPrice = sedanPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    
    
    
    @Override
    public long totalSales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ////
}
