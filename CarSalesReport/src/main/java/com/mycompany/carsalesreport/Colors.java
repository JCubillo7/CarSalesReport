
package com.mycompany.carsalesreport;

import java.io.Serializable;

/**
 *
 * @author Joan
 */
public class Colors implements Serializable {
    
    //Attributes
    private int colorId;
    private String color;
    
    //Constructors
    public Colors(){
        
    }
    
    public Colors(int colorId, String color){
        this.colorId = colorId;
        this.color = color;
    }
    
    
    //Getters and setters
    public int getColorId() {
        return colorId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Methods
    //From the interface 
    
}
