package com.xworkz.event.dao;

import com.xworkz.event.entity.EventEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class EventDAoImpl implements EventDAo {
    @Override
    public boolean save(EventEntity eventEntity) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(eventEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public EventEntity getEntity(int i) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventEntity entity = entityManager.find(EventEntity.class, i);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return entity;
    }

    @Override
    public boolean update(int i, EventEntity eventEntity) {
        boolean isUpdated = false;

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventEntity entityUpdate = entityManager.find(EventEntity.class, i);

        if (entityUpdate != null) {


            entityUpdate.setEventName(eventEntity.getEventName());
            entityUpdate.setLocation(eventEntity.getLocation());
            entityUpdate.setEventTime(eventEntity.getEventTime());
            entityUpdate.setEventManager(eventEntity.getEventManager());

            entityManager.merge(entityUpdate);
            isUpdated = true;
            entityManager.getTransaction().commit();
            return isUpdated;
        } else return isUpdated;
    }

    @Override
    public boolean deleteByIdDAO(int i) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventEntity entity = entityManager.find(EventEntity.class, i);

        if (entity != null) {
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    }


}
