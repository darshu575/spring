package com.xworkz.event.dao;

import com.xworkz.event.entity.EventEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class EventDAoImpl implements EventDAo {
    @Override
    public boolean save(EventEntity eventEntity) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(EventEntity.class);


        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(eventEntity);
        transaction.commit();


        return true;
    }
}
