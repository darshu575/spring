package com.xworkz.darshan_xworkzModul.dao.respondDao;

import com.xworkz.darshan_xworkzModul.entity.respondEntity.RespondEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class RespondDaoImpl implements RespondDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public Boolean saveRespond(RespondEntity respondEntity) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(respondEntity);
        entityManager.getTransaction().commit();


        return true;
    }
}
