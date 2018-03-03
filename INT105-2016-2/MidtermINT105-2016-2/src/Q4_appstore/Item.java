package Q4_appstore;

public abstract class Item implements Comparable {

    protected String appName, category;
    private double price;
    private static String orderBy = "appName";

    public Item(String appName, String category, double price) {
        this.appName = appName;
        this.category = category;
        this.price = price;
    }

    public static String getOrderBy() {
        return orderBy;
    }

    public static void setOrderBy(String orderBy) {
        Item.orderBy = orderBy;
    }

     public abstract String getType();

    @Override
    public int compareTo(Object obj) {
//       Students have not learned (so far) enum 
        int result = 0;
        if (obj != null && obj instanceof Item) {
            Item objItem = (Item) obj;
            if (orderBy.equalsIgnoreCase("price")) {
                result = (int) (this.price - objItem.price);
            } else if (orderBy.equalsIgnoreCase("category")) {
                result = this.getType().compareTo(objItem.getType());
                if (result == 0) {
                    result = this.category.compareTo(objItem.category);
                }
            } else if (orderBy.equalsIgnoreCase("type")) {
                result = this.getType().compareTo(objItem.getType());
            }
            if (result == 0) {
                result = this.appName.compareTo(objItem.appName);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return getType()+"\tCategory: " + category + "\t - Name: " + appName +  "\tprice " + price ;
    }  
}
