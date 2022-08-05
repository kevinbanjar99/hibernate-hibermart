package com.danamon.hibermart.config;

import com.danamon.hibermart.dao.ProductDao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory ;
    private static ProductDao productDao;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null){
            Configuration configuration = new Configuration();
            sessionFactory = configuration.configure("Hibernate.cfg.xml").buildSessionFactory();
        }
        return sessionFactory;
    }


}
