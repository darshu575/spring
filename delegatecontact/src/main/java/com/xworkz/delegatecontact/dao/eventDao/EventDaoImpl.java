package com.xworkz.delegatecontact.dao.eventDao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

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

    @Override
    public List getAllEvents() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery(
                    "SELECT DISTINCT e FROM EventEntity e LEFT JOIN FETCH e.tpoList", EventEntity.class
            );

            return query.getResultList();

        } finally {
            entityManager.close();
        }
    }
}

