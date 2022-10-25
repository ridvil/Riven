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
public class Rent implements CommonCosts{
    private double monthlyRent;
    private double yearlyRent;

    public Rent() {
    }

    public Rent(double monthlyRent, double yearlyRent) {
        this.monthlyRent = monthlyRent;
        this.yearlyRent = yearlyRent;
    }
    

    /**
     * @return the monthlyRent
     */
    public double getMonthlyRent() {
        return monthlyRent;
    }

    /**
     * @param monthlyRent the monthlyRent to set
     */
    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    /**
     * @return the yearlyRent
     */
    public double getYearlyRent() {
        return yearlyRent;
    }

    /**
     * @param yearlyRent the yearlyRent to set
     */
    public void setYearlyRent(double yearlyRent) {
        this.yearlyRent = yearlyRent;
    }

    @Override
    public long calcTotalCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
