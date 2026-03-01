package com.xworkz.delegatecontact.dao;

import com.xworkz.delegatecontact.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
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
}
