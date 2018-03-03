package Q3_carRental;

public class Car {
    private String licensePlate;
    private double pricePerHour;

    public Car(String licensePlate, double pricePerHour) {
        this.licensePlate = licensePlate;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public String toString() {
        return "license plate: " + licensePlate + ", price " + pricePerHour+" per hour" ;
    }
        
}
