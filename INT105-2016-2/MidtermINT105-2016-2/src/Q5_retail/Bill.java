package Q5_retail;

public abstract class Bill {

    protected long billId;
    private Customer cust;
    private double totalPrice;
    private double promoPrice;

    public Bill(Customer cust, double price) {
        this.cust = cust;
        this.totalPrice = price;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public void setPromoPrice(Bill bill, double minPrice, double percentPro, double maxPro) {
        if (this instanceof GoodsBill && bill instanceof FoodBill  && this.cust.getCustId() == bill.cust.getCustId() && this.totalPrice > minPrice) {
            promoPrice = percentPro * this.getTotalPrice() / 100;
        }
        if (promoPrice > maxPro) {
            promoPrice = maxPro;
        }
    }

    @Override
    public String toString() {
        return "Bill id: " + billId + " " + cust + "\nTotal Price = " + totalPrice + ", Promotion Price=" + promoPrice + "\nNet : " + (totalPrice - promoPrice);
    }

}
