package Q4_appstore;

import java.util.Arrays;

public class SitAppStore {
    public static void main(String[] args) {
        Item[] items=new Item[4];
        items[0]=new Movie("Wall-E", "Family", 150);
        items[1]=new Movie("Guardians of the Galaxy", "Action & Adventure", 200);
        items[2]=new Application("TO-FU", "Education", 360);
        items[3]=new Application("Minecraft", "Game", 80);

        Item.setOrderBy("appName");
        showMe(items);
        Item.setOrderBy("category");
        showMe(items);
        Item.setOrderBy("price");
        showMe(items);

    }
    
    public static void showMe(Item[] items) {        
        Arrays.sort(items);
        System.out.println("Order By: "+Item.getOrderBy());
        for(Item item:items){
            System.out.println(item);
        }   
        System.out.println("");
    }
}
