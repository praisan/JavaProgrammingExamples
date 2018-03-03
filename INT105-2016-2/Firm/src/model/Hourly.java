
package model;

public class Hourly extends Employee{
    private int hoursWorks;

    public Hourly( String name, String address, String phone, String ssn, double payRate) {
        super(name, address, phone, ssn, payRate);
    }

    public void addHours(int hoursWorks) {
        this.hoursWorks += hoursWorks;
    }
    
    public double pay(){
        return payRate*hoursWorks;
    }

    
    
}
