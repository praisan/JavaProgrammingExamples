package Q5_retail;

public class GoodsBill extends Bill {

    private static long count;

    public GoodsBill(Customer cust, double price) {
        super(cust, price);
        count++;
        this.billId = count;
    }

    public static long getNumOfBill() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Goods Bill, "+super.toString();
    }
}
