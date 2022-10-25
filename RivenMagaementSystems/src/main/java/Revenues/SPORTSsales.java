/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revenues;

import java.util.logging.Logger;

/**
 *
 * @author dpw82
 */
public class SPORTSsales implements CommonSalesData{
    
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
        return SELECT SUM(column_name) FROM table_name WHERE condition;
    }
    
}
