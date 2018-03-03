package ahaShop.model;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Product {
    private int product_id;
    private String product_name;
    private double ptoduct_price;

    public Product(int product_id, String product_name, double ptoduct_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.ptoduct_price = ptoduct_price;
    }
//    public Product(ResultSet rs) throws SQLException {
//        orm(rs,this);
//    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPtoduct_price() {
        return ptoduct_price;
    }

    public void setPtoduct_price(double ptoduct_price) {
        this.ptoduct_price = ptoduct_price;
    }
    
//    public static void orm(ResultSet rs,Product prod) throws SQLException{
//        prod.setProduct_id(rs.getInt("product_id"));
//        prod.setProduct_name(rs.getString("product_name"));
//        prod.setPtoduct_price(rs.getDouble("price"));
//    }

    @Override
    public String toString() {
        return "id: "+product_id + "\t" + product_name + "\t price=" + ptoduct_price;
    }
    
}
