package sit.sitcom.model;
// Generated Dec 27, 2017 2:28:30 PM by Hibernate Tools 4.3.1


import com.sun.javafx.binding.StringFormatter;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import sit.sitcom.datasource.HibernateSessionFactory;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name="PRODUCT"
    ,schema="APP"
)
public class Product  implements java.io.Serializable {


     private int productId;
     private int manufacturerId;
     private String productCode;
     private BigDecimal purchaseCost;
     private Integer quantityOnHand;
     private BigDecimal markup;
     private String available;
     private String description;

    public Product() {
    }

	
    public Product(int productId, int manufacturerId, String productCode) {
        this.productId = productId;
        this.manufacturerId = manufacturerId;
        this.productCode = productCode;
    }
    public Product(int productId, int manufacturerId, String productCode, BigDecimal purchaseCost, Integer quantityOnHand, BigDecimal markup, String available, String description) {
       this.productId = productId;
       this.manufacturerId = manufacturerId;
       this.productCode = productCode;
       this.purchaseCost = purchaseCost;
       this.quantityOnHand = quantityOnHand;
       this.markup = markup;
       this.available = available;
       this.description = description;
    }
   
     @Id 

    
    @Column(name="PRODUCT_ID", unique=true, nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }

    
    @Column(name="MANUFACTURER_ID", nullable=false)
    public int getManufacturerId() {
        return this.manufacturerId;
    }
    
    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    
    @Column(name="PRODUCT_CODE", nullable=false, length=2)
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    
    @Column(name="PURCHASE_COST", precision=12)
    public BigDecimal getPurchaseCost() {
        return this.purchaseCost;
    }
    
    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    
    @Column(name="QUANTITY_ON_HAND")
    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }
    
    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    
    @Column(name="MARKUP", precision=4)
    public BigDecimal getMarkup() {
        return this.markup;
    }
    
    public void setMarkup(BigDecimal markup) {
        this.markup = markup;
    }

    
    @Column(name="AVAILABLE", length=5)
    public String getAvailable() {
        return this.available;
    }
    
    public void setAvailable(String available) {
        this.available = available;
    }

    
    @Column(name="DESCRIPTION", length=50)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%6d %-45s %10.2f",this.productId,this.description,this.purchaseCost);        
    }
    public static Product getProductById(int productId){
        Session session = HibernateSessionFactory.getSession();
        Product p =(Product)session.get(Product.class, productId);
        session.close();
        return p;
    }
    public static List<Product> getProductByDescription(String description) {
        Session session = HibernateSessionFactory.getSession();
        Query query = session.createQuery("from Product where description like ?");
        query.setString(0, description+"%");
        List<Product> productList=query.list();
        session.close();
        return productList;
    }

    public double getPrice() {
        return this.markup.doubleValue()+this.purchaseCost.doubleValue();
    }
}


