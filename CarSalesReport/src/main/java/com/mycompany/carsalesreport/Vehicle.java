
package com.mycompany.carsalesreport;

import java.io.Serializable;

/**
 *
 * @author Joan
 */
public class Vehicle implements Serializable{
    
    //Attributes
    private int vehicleID;
    private Colors color;
    private String make;
    private String model;
    private String vehicleType;
    
    //Constructors
    
    public Vehicle(){
        
    }
    
    public Vehicle(int vehicleID, Colors color, String make, String model, String vehicleType) {
        this.vehicleID = vehicleID;
        this.color = color;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
    }
    
    //Setters and getters
    public int getVehicleID() {
        return vehicleID;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    //Methods
    //From the interface 
    

    
}
