/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.sitcom.driver;

import java.util.List;
import org.hibernate.Session;
import sit.sitcom.datasource.HibernateSessionFactory;
import sit.sitcom.model.Product;

/**
 *
 * @author INT676
 */
public class TestHibernate {
    public static void main(String[] args) {
//        Session session = HibernateSessionFactory.getSession();
//        Product p= (Product)session.get(Product.class, 980001);
//        System.out.println(p);
//        List<Product> productList=session.createQuery("from Product").list();
//        System.out.println("-----------------------------------------");
//        productList.forEach((product) -> {
//            System.out.println(product);
//        });
        
        Product p= Product.getProductById(980001);
        System.out.println(p);
        List<Product> productList=Product.getProductByDescription("J");
        System.out.println("-----------------------------------------");
        productList.forEach((product) -> {
            System.out.println(product);
        });
        System.exit(0);
    }
}
