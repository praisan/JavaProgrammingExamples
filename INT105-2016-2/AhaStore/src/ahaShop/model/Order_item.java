package ahaShop.model;

public class Order_item {
    private Product prod;
    private int quantity;

    public Order_item(Product prod, int quantity) {
        this.prod = prod;
        this.quantity = quantity;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getTotalPrice() {
        return quantity*prod.getPtoduct_price();
    }
    

    @Override
    public String toString() {
        return String.format("%-50s quantity %5d total %5.2f",prod.getProduct_name(),quantity,getTotalPrice());
    }
    
}
