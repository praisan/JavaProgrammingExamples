package Q5_retail;

public class FoodBill extends Bill{
    private static long count;

    public FoodBill(Customer cust, double price) {
        super(cust, price);
        count++;
        this.billId=count;
    }

    public static long getNumOfBill() {
        return count;
    }

    @Override
    public String toString() {
        return "Food Bill, "+super.toString();
    }
    
}
