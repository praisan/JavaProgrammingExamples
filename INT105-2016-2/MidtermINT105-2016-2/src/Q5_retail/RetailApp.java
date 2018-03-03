package Q5_retail;

public class RetailApp {

    public static void main(String[] args) {
        Customer[] cust = {new Customer(), new Customer()};
        double minPrice4Pro = 7000;
        double percentPro=600;
        double maxPro=500;
        double promoPrice;
        
        Bill[] bills=new Bill[4];
        
        bills[0]= new FoodBill(cust[0], 500);
        bills[1]= new FoodBill(cust[1], 500);
        bills[2] = new GoodsBill(cust[0], 5000);
        bills[3] = new GoodsBill(cust[1], 3500);   
        
        bills[0].setPromoPrice(bills[1], minPrice4Pro, percentPro, maxPro); 
        bills[2].setPromoPrice(bills[0], minPrice4Pro, percentPro, maxPro); 
        bills[2].setPromoPrice(bills[1], minPrice4Pro, percentPro, maxPro); 
        
        for(Bill bill:bills){
            System.out.println(bill.toString()+"\n");     
        }   
    }
}
