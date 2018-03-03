package ahaShop;

import ahaShop.model.Order;
import ahaShop.model.Product;

public class Shop {

    public static void main(String[] args) {
        Product[] prods = new Product[3];
        prods[0] = new Product(1, "Diamondback Women\'s Serene Classic Comfort Bi", 300);
        prods[1] = new Product(2, "Nike Men\'s CJ Elite 2 TD Football Cleat", 130);
        prods[2] = new Product(3, "Nike Men\'s Dri-FIT Victory Golf Polo", 50);
        
        Order myOrder=new Order(1,Order.Stutus.PENDING);
        myOrder.addItem(prods[0], 10);
        myOrder.addItem(prods[1], 5);
        myOrder.addItem(prods[2], 8);
        
        System.out.println(myOrder);
    }
}
