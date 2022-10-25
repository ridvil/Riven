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
public class TAX implements CommonCosts{
    private double salesTax;
    private double propertyTax;
    private double stateTax;
    private double federalTax;

    /**
     * @return the salesTax
     */
    public double getSalesTax() {
        return salesTax;
    }

    /**
     * @param salesTax the salesTax to set
     */
    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    /**
     * @return the propertyTax
     */
    public double getPropertyTax() {
        return propertyTax;
    }

    /**
     * @param propertyTax the propertyTax to set
     */
    public void setPropertyTax(double propertyTax) {
        this.propertyTax = propertyTax;
    }

    /**
     * @return the stateTax
     */
    public double getStateTax() {
        return stateTax;
    }

    /**
     * @param stateTax the stateTax to set
     */
    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    /**
     * @return the federalTax
     */
    public double getFederalTax() {
        return federalTax;
    }

    /**
     * @param federalTax the federalTax to set
     */
    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }
}
