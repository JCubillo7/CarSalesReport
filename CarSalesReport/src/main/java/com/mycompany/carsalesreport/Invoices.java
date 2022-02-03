
package com.mycompany.carsalesreport;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Joan
 */
public class Invoices implements Serializable{
    
    //Attributes
    private int invoiceID;
    private String invoiceNumber;
    private Client client;
    private Date invoiceDate;
    private double totalDiscount;
    private double deliveryCharge;
    private DateDimension dateKey;
    
    //Constructors
    public Invoices(){
        
    }
    
    public Invoices(int invoiceID, String invoiceNumber, Client client, Date invoiceDate, double totalDiscount, double deliveryCharge, DateDimension dateKey) {
        this.invoiceID = invoiceID;
        this.invoiceNumber = invoiceNumber;
        this.client = client;
        this.invoiceDate = invoiceDate;
        this.totalDiscount = totalDiscount;
        this.deliveryCharge = deliveryCharge;
        this.dateKey = dateKey;
    }
    //Getters and setters
    public int getInvoiceID() {
        return invoiceID;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public DateDimension getDateKey() {
        return dateKey;
    }

    public void setDateKey(DateDimension dateKey) {
        this.dateKey = dateKey;
    }
    
    //Methods

    //From the interface 

    
    
}
