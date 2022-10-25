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
public class MiscellaniousFees implements CommonCosts {
    
    private double monthlyCleaningbill;
    private double monthlyOfficeExpenses;
    private double monthlyTechnologyCosts;
    
    public MiscellaniousFees(){
        
    }
    
    public MiscellaniousFees(double monthlyCleaningbill, double monthlyOfficeExpenses, double monthlyTechnologyCosts){
        this.monthlyCleaningbill = monthlyCleaningbill;
        this.monthlyOfficeExpenses = monthlyOfficeExpenses;
        this.monthlyTechnologyCosts = monthlyTechnologyCosts;
    }

    @Override
    public double totalCosts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the monthlyCleaningbill
     */
    public double getMonthlyCleaningbill() {
        return monthlyCleaningbill;
    }

    /**
     * @param monthlyCleaningbill the monthlyCleaningbill to set
     */
    public void setMonthlyCleaningbill(double monthlyCleaningbill) {
        this.monthlyCleaningbill = monthlyCleaningbill;
    }

    /**
     * @return the monthlyOfficeExpenses
     */
    public double getMonthlyOfficeExpenses() {
        return monthlyOfficeExpenses;
    }

    /**
     * @param monthlyOfficeExpenses the monthlyOfficeExpenses to set
     */
    public void setMonthlyOfficeExpenses(double monthlyOfficeExpenses) {
        this.monthlyOfficeExpenses = monthlyOfficeExpenses;
    }

    /**
     * @return the monthlyTechnologyCosts
     */
    public double getMonthlyTechnologyCosts() {
        return monthlyTechnologyCosts;
    }

    /**
     * @param monthlyTechnologyCosts the monthlyTechnologyCosts to set
     */
    public void setMonthlyTechnologyCosts(double monthlyTechnologyCosts) {
        this.monthlyTechnologyCosts = monthlyTechnologyCosts;
    }
    
}
