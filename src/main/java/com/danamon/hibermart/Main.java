package com.danamon.hibermart;

import com.danamon.hibermart.dao.ProductDao;
import com.danamon.hibermart.model.Product;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Kacamata Kudassad", 200000, 5);
        Product productNew = new Product(17,"Kacamata Kuda Terbang", 350000, 8);


        ProductDao productDao = new ProductDao();

        //productDao.insertProduct(product);

        //productDao.updateProduct(productNew);

        //productDao.deleteProduct(productNew);

        //System.out.println(productDao.getProductByID(0));

/*

        List<Product> allProduct = productDao.getAllProduct();
        for(Product product1 : allProduct){
            System.out.println(product1);
        }
*/

        //productDao.updateProductID(1001,9999);

        //Still Error
        //System.out.println(productDao.getProductPrice(1).getClass());
        Object[] test = (Object[]) productDao.getProductPrice(1);
        System.out.print(test[0]+",");
        System.out.println(test[1]);

    }
}
