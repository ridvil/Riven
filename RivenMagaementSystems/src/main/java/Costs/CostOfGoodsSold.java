/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Costs;

/**
 *
 * @author dpw82
 */
public class CostOfGoodsSold implements CommonCosts{

    @Override
    public long calcTotalCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private double SUVcost;
    private double SEDANcost;
    private double SPORTScost;
    private String CarName;

    /**
     * @return the SUVcost
     */
    public double getSUVcost() {
        return SUVcost;
    }

    /**
     * @param SUVcost the SUVcost to set
     */
    public void setSUVcost(double SUVcost) {
        this.SUVcost = SUVcost;
    }

    /**
     * @return the SEDANcost
     */
    public double getSEDANcost() {
        return SEDANcost;
    }

    /**
     * @param SEDANcost the SEDANcost to set
     */
    public void setSEDANcost(double SEDANcost) {
        this.SEDANcost = SEDANcost;
    }

    /**
     * @return the SPORTScost
     */
    public double getSPORTScost() {
        return SPORTScost;
    }

    /**
     * @param SPORTScost the SPORTScost to set
     */
    public void setSPORTScost(double SPORTScost) {
        this.SPORTScost = SPORTScost;
    }

    /**
     * @return the CarName
     */
    public String getCarName() {
        return CarName;
    }

    /**
     * @param CarName the CarName to set
     */
    public void setCarName(String CarName) {
        this.CarName = CarName;
    }
    
    
    
}
