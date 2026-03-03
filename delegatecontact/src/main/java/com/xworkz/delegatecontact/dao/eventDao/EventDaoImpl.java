package com.xworkz.delegatecontact.dao.eventDao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class EventDaoImpl implements EventDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveEvents(EventEntity eventEntity) {

        System.out.println("saveEvents DAo Started");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(eventEntity);
        entityManager.getTransaction().commit();

        return true;
    }
}
