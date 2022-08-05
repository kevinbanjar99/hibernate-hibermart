package com.danamon.hibermart.dao;

import com.danamon.hibermart.config.HibernateConfig;
import com.danamon.hibermart.model.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDao {
    public Session session;

    public ProductDao() {
        this.session = HibernateConfig.getSessionFactory().openSession();
    }

    public void insertProduct(Product product) {
        try {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void updateProduct(Product product) {
        try {
            session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void deleteProduct(Product product) {
        try {
            session.beginTransaction();
            session.delete(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }


    public Product getProductByID(int id) {
        try {
            Query query = session.createQuery("FROM Product WHERE id=:id");
            query.setParameter("id", id);
            return (Product) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return null;
    }

    public List<Product> getAllProduct() {
        try {
            return session.createQuery("FROM Product", Product.class).list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return null;
    }

    public void updateProductID(int targetID, int newID){
        try {
            Query q=session.createQuery("update Product set id=:nid where id=:oid");
            q.setParameter("nid",newID);
            q.setParameter("oid",targetID);
            q.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public Object getProductPrice(int targetID){
        try {
            Query q=session.createQuery("select name,productPrice from Product where id=:id");
            q.setParameter("id",targetID);
            return q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return null;
    }
}

