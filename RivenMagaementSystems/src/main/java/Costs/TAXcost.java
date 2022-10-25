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
public class TAXcost implements CommonCosts {
    
    private double stateTAX;
    private double federalTAX;
    private double salesTAX;
    private double socialsecurityTAX;
    
    public TAXcost(){
        
    }
    
    public TAXcost(double stateTAX, double federalTAX, double salesTAX, double socialsecurityTAX){
        this.stateTAX = stateTAX;
        this.federalTAX = federalTAX;
        this.salesTAX = salesTAX;
        this.socialsecurityTAX = socialsecurityTAX;
    }
    
    @Override
    public double totalCosts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the stateTAX
     */
    public double getStateTAX() {
        return stateTAX;
    }

    /**
     * @param stateTAX the stateTAX to set
     */
    public void setStateTAX(double stateTAX) {
        this.stateTAX = stateTAX;
    }

    /**
     * @return the federalTAX
     */
    public double getFederalTAX() {
        return federalTAX;
    }

    /**
     * @param federalTAX the federalTAX to set
     */
    public void setFederalTAX(double federalTAX) {
        this.federalTAX = federalTAX;
    }

    /**
     * @return the salesTAX
     */
    public double getSalesTAX() {
        return salesTAX;
    }

    /**
     * @param salesTAX the salesTAX to set
     */
    public void setSalesTAX(double salesTAX) {
        this.salesTAX = salesTAX;
    }

    /**
     * @return the socialsecurityTAX
     */
    public double getSocialsecurityTAX() {
        return socialsecurityTAX;
    }

    /**
     * @param socialsecurityTAX the socialsecurityTAX to set
     */
    public void setSocialsecurityTAX(double socialsecurityTAX) {
        this.socialsecurityTAX = socialsecurityTAX;
    }
    
}
