package com.xworkz.xworkzModel.dao;

import com.xworkz.xworkzModel.entity.EmailOTPEntity;
import com.xworkz.xworkzModel.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ModelDaoImpl implements ModelDao {

    @Autowired
    EntityManagerFactory factory;

    @Override
    public boolean save(UserEntity entity) {

        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(entity);

        manager.getTransaction().commit();
        return true;
    }

    @Override
    public UserEntity checkEmailAndPassword(String email, String password) {

        EntityManager manager = factory.createEntityManager();
        try {
            Query query = manager.createQuery(
                    "from UserEntity u where u.email = :email and u.password = :password"
            );
            query.setParameter("email", email);
            query.setParameter("password", password);

            return (UserEntity) query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            manager.close();
        }
    }

    @Override
    public UserEntity findByEmail(String email) {

        System.out.println("email in dao find by email :" + email);
        EntityManager manager = factory.createEntityManager();
        try {
            Query query = manager.createQuery(
                    "select u from UserEntity u where u.email =:email");

            query.setParameter("email", email);
            UserEntity entity = (UserEntity) query.getSingleResult();

            System.out.println("dao result find by mail :" + entity);

            if (entity == null) {
                return null;
            }
            return entity;
        } catch (NoResultException e) {
            return null; //  handled
        } finally {
            manager.close();
        }
    }

    @Override
    public UserEntity updateFailedAttempts(UserEntity entity) {

        System.out.println("entity dao update  :" + entity);
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        UserEntity updated = manager.merge(entity);

        System.out.println("updated entity in dao :" + updated);

        manager.getTransaction().commit();
        return updated;
    }

    @Override
    public int getFailedAttemptsByDB(int id) {

        EntityManager manager = factory.createEntityManager();
        Query query = manager.createQuery("select user.failedAttempts from UserEntity user where user.id=:id");
        query.setParameter("id", id);

        int getId = (int) query.getSingleResult();
        System.out.println("dao get id:" + getId);
        return getId;
    }

    @Override
    public boolean setAttemptsZero(int id, int failedAttempts) {

        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        Query query = manager.createQuery("update UserEntity user set user.failedAttempts=:failedAttempts where user.id=:id");
        query.setParameter("id", id);
        query.setParameter("failedAttempts", failedAttempts);


        int update = query.executeUpdate();
        manager.getTransaction().commit();
        return update == 1;
    }

    @Override
    public boolean svaeOtpWithEmail(EmailOTPEntity emailOTPEntity) {

        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(emailOTPEntity);
        manager.getTransaction().commit();

        return true;
    }

    @Override
    public EmailOTPEntity getOtpBymail(String email) {

        EntityManager manager = factory.createEntityManager();
        try {
            List<EmailOTPEntity> list = manager.createQuery(
                            "select e from EmailOTPEntity e where e.email = :email order by e.id desc",
                            EmailOTPEntity.class)
                    .setParameter("email", email)
                    .setMaxResults(1)   // ✅ VERY IMPORTANT
                    .getResultList();

            return list.isEmpty() ? null : list.get(0);

        } finally {
            manager.close();
        }
    }

    @Override
    public boolean resetPassword(int id, String password) {

        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();

            UserEntity entity = manager.find(UserEntity.class, id);
            if (entity == null) {
                return false;
            }

            entity.setPassword(password);
            manager.merge(entity);

            manager.getTransaction().commit();
            return true;

        } finally {
            manager.close();
        }
    }

    @Override
    public void deleteOtp(EmailOTPEntity entity) {

        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        EmailOTPEntity merged = manager.merge(entity);
        manager.remove(merged);
        manager.getTransaction().commit();
        manager.close();
    }

}
