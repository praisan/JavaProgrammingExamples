package model;

public class Executive extends Employee{
    private double bonus;

    public Executive(String name, String address, String phone,String ssn, double payRate) {
        super(name, address, phone,ssn, payRate);
    }

    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }
    public double pay(){
        return super.pay()+bonus;
    }
}
