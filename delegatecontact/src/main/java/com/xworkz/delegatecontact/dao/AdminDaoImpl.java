package com.xworkz.delegatecontact.dao;

import com.xworkz.delegatecontact.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao{

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public AdminEntity getByEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery(
                    "from AdminEntity a where a.email = :uemail",
                    AdminEntity.class
            );

            query.setParameter("uemail", email);

            AdminEntity admin = (AdminEntity) query.getSingleResult();

            return admin;

        } catch (Exception e) {
            return null;  // if email not found
        } finally {
            entityManager.close();
        }
    }

    @Override
    public int getAllEvent() {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Long countEvent;
        try {
            Query query = entityManager.createQuery(
                    "SELECT COUNT(e) FROM EventEntity e");

            countEvent = (Long) query.getSingleResult();
        }finally {
            entityManager.close();
        }


        return countEvent.intValue();
    }

    @Override
    public int getAllGelegate() {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Long countDelegate;
        try {
            Query query = entityManager.createQuery(
                    "SELECT COUNT(d) FROM DelegateEntity d");

            countDelegate = (Long) query.getSingleResult();
        }finally {
            entityManager.close();
        }

        return countDelegate.intValue();
    }

    @Override
    public int getAllResponses() {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Long countResponses;
        try {
            Query query = entityManager.createQuery(
                    "SELECT COUNT(e) FROM RespondEntity e");

             countResponses = (Long) query.getSingleResult();
        }finally {
            entityManager.close();
        }


        return countResponses.intValue();
    }

    @Override
    public List<Object[]> getEventResponses() {
   EntityManager entityManager= entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery(
                "SELECT r.eventId, COUNT(r) FROM RespondEntity r GROUP BY r.eventId"
        );

        return query.getResultList();
    }
}
