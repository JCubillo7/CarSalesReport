
package com.mycompany.carsalesreport;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Joan
 */
public class Client implements Serializable{
    
    //Attributes
    private int clientId;
    private String clientName;
    private String address1;
    private String address2;
    private String town; 
    private String county;
    private String postCode;
    private String region;
    private String outerPostode;
    private Country country;
    private int clientType;
    private int clientSize;
    private Date clientSince;
    private boolean isCreditWorthy;
    private boolean isDealer;
    
    //Constructors
    
    public Client(){
        
    }
    
    public Client(int clientId, String clientName, String address1, String address2, String town, String county, String postCode, String region, String outerPostode, Country country, int clientType, int clientSize, Date clientSince, boolean isCreditWorthy, boolean isDealer) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.county = county;
        this.postCode = postCode;
        this.region = region;
        this.outerPostode = outerPostode;
        this.country = country;
        this.clientType = clientType;
        this.clientSize = clientSize;
        this.clientSince = clientSince;
        this.isCreditWorthy = isCreditWorthy;
        this.isDealer = isDealer;
    }
    
    //Getters and setters
    public int getClientId() {
        return clientId;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOuterPostode() {
        return outerPostode;
    }

    public void setOuterPostode(String outerPostode) {
        this.outerPostode = outerPostode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getClientType() {
        return clientType;
    }

    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

    public int getClientSize() {
        return clientSize;
    }

    public void setClientSize(int clientSize) {
        this.clientSize = clientSize;
    }

    public Date getClientSince() {
        return clientSince;
    }

    public void setClientSince(Date clientSince) {
        this.clientSince = clientSince;
    }

    public boolean isIsCreditWorthy() {
        return isCreditWorthy;
    }

    public void setIsCreditWorthy(boolean isCreditWorthy) {
        this.isCreditWorthy = isCreditWorthy;
    }

    public boolean isIsDealer() {
        return isDealer;
    }

    public void setIsDealer(boolean isDealer) {
        this.isDealer = isDealer;
    }
    
    //Methods
    //From the interface

    

}
