package ahaShop.model;

import java.util.ArrayList;

public class Order {
    private int bill_id;
    private Stutus status;
    ArrayList<Order_item> items=new ArrayList();
    
    public static enum Stutus {
        CLOSED, PENDING_PAYMENT, COMPLETE,
        PROCESSING, PAYMENT_REVIEW, PENDING;
    }

    public Order(int bill_id, Stutus status) {
        this.bill_id = bill_id;
        this.status = status;
    }

    public Order(int bill_id, Stutus status, ArrayList items) {
        this.bill_id = bill_id;
        this.status = status;
        this.items = items;
    }
    
    public void addItem(Product prod,int quantity){
        items.add(new Order_item(prod,quantity));
    }
    
    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public Stutus getStatus() {
        return status;
    }
    
    public String getStatusString() {
        return status.name();
    }

    public void setStatus(Stutus status) {
        this.status = status;
    }
    
    public void setStatus(String status) {
        this.status = Stutus.valueOf(status);
    }
    
    public double getTotalPrice() {
        double total=0;
        for(Order_item temp:items){
            total+=temp.getTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        String str="Bill id: " + bill_id + ", status=" + status.name() + "\n";
        int count=0;
        for(Order_item temp:items){
            count++;
            str+=count+". "+temp.toString()+"\n";
        }
        str+="Total: "+String.format("%.2f",getTotalPrice());
        return str;
    }
    
   
}
