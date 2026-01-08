package com.xworkz.event.dao;

import com.xworkz.event.entity.EventsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventDAOImpl implements EventDAO {
    @Override
    public boolean save(EventsEntity entity) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public EventsEntity getEntity(int id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventsEntity entity = entityManager.find(EventsEntity.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return entity;
    }

    @Override
    public boolean update(int id, EventsEntity entity) {
        boolean isUpdated = false;

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventsEntity entityUpdate = entityManager.find(EventsEntity.class, id);

        if (entityUpdate != null) {

            entityUpdate.setOrganizerName(entity.getOrganizerName());
            entityUpdate.setTime(entity.getTime());
            entityUpdate.setLocation(entity.getLocation());
            entityUpdate.setNoOfPeople(entity.getNoOfPeople());

            entityManager.merge(entityUpdate);
            isUpdated = true;
            entityManager.getTransaction().commit();
            return isUpdated;
        } else return isUpdated;
    }

    @Override
    public boolean deleteByIdDAO(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventsEntity entity = entityManager.find(EventsEntity.class, id);

        if (entity != null) {
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    }

}
