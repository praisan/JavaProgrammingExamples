
package model;

public abstract class StaffMember {
    protected String name,address,phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name: " + name + "\naddress: " + address + "\nphone: " + phone;
    }
    
    public abstract double pay();
}
