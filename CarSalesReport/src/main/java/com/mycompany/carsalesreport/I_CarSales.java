
package com.mycompany.carsalesreport;

/**
 *
 * @author Joan
 */
public interface I_CarSales {
    @Override
    public String toString();
    
    //CRUD methods
    //Returns a boolean value that indicates whether the process was completed successfully
    public boolean Create();
    public boolean Delete();
    public boolean Update();
}
