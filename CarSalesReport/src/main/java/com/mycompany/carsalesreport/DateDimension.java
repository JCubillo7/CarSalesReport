
package com.mycompany.carsalesreport;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Joan
 */
public class DateDimension implements Serializable {
    
    //Attributes
    private Date dateKey;
    private int year;
    private int monthNum;
    private String monthFull;
    private String monthAbbr;
    private int quarterNum;
    private String quarterFull;
    private String quarterAbbr;
    private int yearAndQuarterNum;
    
    //Constructors
    public DateDimension(){
        
    }
    
    public DateDimension(Date dateKey, int year, int monthNum, String monthFull, String monthAbbr, int quarterNum, String quarterFull, String quarterAbbr, int yearAndQuarterNum) {
        this.dateKey = dateKey;
        this.year = year;
        this.monthNum = monthNum;
        this.monthFull = monthFull;
        this.monthAbbr = monthAbbr;
        this.quarterNum = quarterNum;
        this.quarterFull = quarterFull;
        this.quarterAbbr = quarterAbbr;
        this.yearAndQuarterNum = yearAndQuarterNum;
    }
    
    //Getters and setters
    public Date getDateKey() {
        return dateKey;
    }

    public void setDateKey(Date dateKey) {
        this.dateKey = dateKey;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public String getMonthFull() {
        return monthFull;
    }

    public void setMonthFull(String monthFull) {
        this.monthFull = monthFull;
    }

    public String getMonthAbbr() {
        return monthAbbr;
    }

    public void setMonthAbbr(String monthAbbr) {
        this.monthAbbr = monthAbbr;
    }

    public int getQuarterNum() {
        return quarterNum;
    }

    public void setQuarterNum(int quarterNum) {
        this.quarterNum = quarterNum;
    }

    public String getQuarterFull() {
        return quarterFull;
    }

    public void setQuarterFull(String quarterFull) {
        this.quarterFull = quarterFull;
    }

    public String getQuarterAbbr() {
        return quarterAbbr;
    }

    public void setQuarterAbbr(String quarterAbbr) {
        this.quarterAbbr = quarterAbbr;
    }

    public int getYearAndQuarterNum() {
        return yearAndQuarterNum;
    }

    public void setYearAndQuarterNum(int yearAndQuarterNum) {
        this.yearAndQuarterNum = yearAndQuarterNum;
    }
    
    //Methods
    //From the interface 
    

    
   
}
