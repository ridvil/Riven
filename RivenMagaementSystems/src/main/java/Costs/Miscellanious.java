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
public class Miscellanious implements CommonCosts{
    private double cleaningCost;
    private double technologyCost;
    private double officeCost;

    public Miscellanious() {
    }

    public Miscellanious(double cleaningCost, double technologyCost, double officeCost) {
        this.cleaningCost = cleaningCost;
        this.technologyCost = technologyCost;
        this.officeCost = officeCost;
    }
    
    /**
     * @return the cleaningCost
     */
    public double getCleaningCost() {
        return cleaningCost;
    }

    /**
     * @param cleaningCost the cleaningCost to set
     */
    public void setCleaningCost(double cleaningCost) {
        this.cleaningCost = cleaningCost;
    }

    /**
     * @return the technologyCost
     */
    public double getTechnologyCost() {
        return technologyCost;
    }

    /**
     * @param technologyCost the technologyCost to set
     */
    public void setTechnologyCost(double technologyCost) {
        this.technologyCost = technologyCost;
    }

    /**
     * @return the officeCost
     */
    public double getOfficeCost() {
        return officeCost;
    }

    /**
     * @param officeCost the officeCost to set
     */
    public void setOfficeCost(double officeCost) {
        this.officeCost = officeCost;
    }

    @Override
    public long calcTotalCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
