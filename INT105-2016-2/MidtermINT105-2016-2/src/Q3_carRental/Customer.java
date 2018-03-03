package Q3_carRental;

public class Customer {
    private String name,sname;

    public Customer(String name,String sname) {
        this.name = name;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return name + ' '+sname;
    }
    
}
