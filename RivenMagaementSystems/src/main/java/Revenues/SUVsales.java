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
public class SUVsales implements CommonSalesData {
    
    private double SUVprice;
    private String carName;

    public SUVsales() {
    }

    public SUVsales(double SUVprice, String carName) {
        this.SUVprice = SUVprice;
        this.carName = carName;
    }

    public double getSUVprice() {
        return SUVprice;
    }

    public void setSUVprice(double SUVprice) {
        this.SUVprice = SUVprice;
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
    
}
