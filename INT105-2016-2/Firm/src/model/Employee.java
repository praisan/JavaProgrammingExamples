/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author INT105
 */
public class Employee extends StaffMember{
    protected String ssn;
    protected double payRate;

    public Employee(String name, String address, String phone,String ssn, double payRate) {
        super(name, address, phone);
        this.ssn = ssn;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nssn=" + ssn;
    }
    public double pay(){
        return payRate*9;
    }
}
