package com.xworkz.darshan_xworkzModul.dao;

import com.xworkz.darshan_xworkzModul.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(UserEntity userEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userEntity);
        entityManager.getTransaction().commit();


        System.out.println(userEntity);
        return true;
    }

    @Override
    public UserEntity getGmail(String gmail) {

       EntityManager entityManager=entityManagerFactory.createEntityManager();
      Query query= entityManager.createQuery("from UserEntity g where g.email=:ugamil",UserEntity.class);
      query.setParameter("ugamil",gmail);
      UserEntity userEntity= (UserEntity) query.getSingleResult();
      return userEntity;


    }

}
