
package com.mycompany.carsalesreport;

import java.io.Serializable;

/**
 *
 * @author Joan
 */
public class InvoiceLines implements Serializable{

    //Attributes
    private int invoiceLineID;
    private Invoices invoice;
    private Stock stock;
    private double salePrice;
    private int lineItem;
    //Constructors

    public InvoiceLines() {    
    }
    
    public InvoiceLines(int invoiceLineID, Invoices invoice, Stock stock, double salePrice, int lineItem){
        this.invoiceLineID = invoiceLineID;
        this.invoice = invoice;
        this.stock = stock;
        this.salePrice = salePrice;
        this.lineItem = lineItem;
        
    }
    //Getters and setters
    public int getInvoiceLineID() {
        return invoiceLineID;
    }

    public Invoices getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoices invoice) {
        this.invoice = invoice;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getLineItem() {
        return lineItem;
    }

    public void setLineItem(int lineItem) {
        this.lineItem = lineItem;
    }
    
    //Methods
    
    //From the interface 
    
    
}
