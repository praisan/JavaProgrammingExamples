package Q5_retail;

public class Customer {
    private long custId;
    private static long count;

    public Customer() {
        count++;
        this.custId = count;
        
    }

    public long getNumOfCustomer() {
        return count;
    }

    public long getCustId() {
        return custId;
    }
    

    @Override
    public String toString() {
        return "Customer id: " + custId;
    }
    
    
    
}
