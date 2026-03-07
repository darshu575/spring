package com.xworkz.delegatecontact.dao.emailsentdao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;
@Repository
public class EmailSentDapImpl implements EmailSentDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public EventEntity getEventById(int eventId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(EventEntity.class, eventId);
        } finally {
            entityManager.close();
        }


    }

    @Override
    public List<TpoEntity> getTpoByEventId(int eventId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery("SELECT t FROM TpoEntity t WHERE t.event.id = :eventId", TpoEntity.class);

            query.setParameter("eventId", eventId);
            return query.getResultList();
        } finally {
            entityManager.close();
        }


    }

    @Override
    public void updateEvent(EventEntity eventEntity) {
        EntityManager  entityManager= entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(eventEntity);
            entityManager.getTransaction().commit();

        }finally {
            entityManager.close();
        }
    }
}
