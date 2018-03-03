
package model;

public class Volunteer extends StaffMember{

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }
    
    public double pay(){
        return 0;
    }
    
}
