package com.xworkz.xworkzModel.dao.batchDao;

import com.xworkz.xworkzModel.entity.batchEntity.BatchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository

public class BatchDaoImpl implements BatchDao {

    @Autowired
    EntityManagerFactory factory;

    public BatchDaoImpl() {
        System.out.println("batch dao impl object");
    }

    @Override
    public boolean savebatch(BatchEntity entity) {

        System.out.println("dao batch ");

        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(entity);

        manager.getTransaction().commit();
        return true;
    }

    @Override
    public List<BatchEntity> getAllBatch() {

        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("select batch from BatchEntity batch");
        List<BatchEntity> batches = query.getResultList();

        System.out.println("dao result :");
        System.out.println(batches);
        manager.close();
        return batches;
    }

    @Override
    public BatchEntity fetchById(int batchId) {

        EntityManager manager = factory.createEntityManager();
        Query query = manager.createQuery("select batch from BatchEntity batch where batch.batchId=:batchId");
        query.setParameter("batchId", batchId);
        BatchEntity entity = (BatchEntity) query.getSingleResult();
        if (entity != null) {
            return entity;
        } else {
            return null;
        }
    }
}

