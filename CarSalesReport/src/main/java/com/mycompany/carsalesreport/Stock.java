
package com.mycompany.carsalesreport;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Joan
 */
public class Stock implements Serializable{
    
    //Attributes
    private int stockId;
    private Vehicle vehicle;
    private double costPrice;
    private int spareParts;
    private double laborCost;
    private Date registration_date;
    private double mileague;
    private Date purchaseDate;
    private int vehicleAgeInYears;
    
    //Constructors
    public Stock(){
        
    }
    public Stock(int stockId, Vehicle vehicle, double costPrice, int spareParts, double laborCost, Date registration_date, double mileague, Date purchaseDate, int vehicleAgeInYears) {
        this.stockId = stockId;
        this.vehicle = vehicle;
        this.costPrice = costPrice;
        this.spareParts = spareParts;
        this.laborCost = laborCost;
        this.registration_date = registration_date;
        this.mileague = mileague;
        this.purchaseDate = purchaseDate;
        this.vehicleAgeInYears = vehicleAgeInYears;
    }
    
    //Getters and setters
    public int getStockId() {
        return stockId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public int getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(int spareParts) {
        this.spareParts = spareParts;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public double getMileague() {
        return mileague;
    }

    public void setMileague(double mileague) {
        this.mileague = mileague;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getVehicleAgeInYears() {
        return vehicleAgeInYears;
    }

    public void setVehicleAgeInYears(int vehicleAgeInYears) {
        this.vehicleAgeInYears = vehicleAgeInYears;
    }
    
    //Methods
    //From the interface 
    

    
}
