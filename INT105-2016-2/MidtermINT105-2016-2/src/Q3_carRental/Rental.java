package Q3_carRental;

public class Rental {
    private Customer cust;
    private Car car;
    private int hours;

    public Rental(Customer cust, Car car, int hours) {
        this.cust = cust;
        this.car = car;
        this.hours = hours;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void addHours(int hours) {
        this.hours += hours;
    }

    @Override
    public String toString() {
        return "Customer: " + cust + " rent car " + car + "\nRent " + hours + " hours, Total "+hours*car.getPricePerHour()+" baht";
    }
    
    
    
    
}
