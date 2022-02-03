
package com.mycompany.carsalesreport;

import java.io.Serializable;

/**
 *
 * @author Joan
 */
public class Country implements Serializable{
    //Attributes
    private int countryId;
    private String countryName;
    private String countryISOCode;
    
    //Constructors
    public Country(){
        
    }
    
    public Country(int countryId, String countryName,String countryISOCode){
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryISOCode = countryISOCode;
    }
    
    //Getters and setters
  
    public int getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }
    
    //Methods
    //From the interface 
    
}
