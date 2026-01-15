package com.xworkz.clothing_company.dao;

import com.xworkz.clothing_company.entity.ClothingEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class ClothingDaoImpl implements ClothingDao {


    @Override
    public boolean save(ClothingEntity clothingEntity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("clothingCompany");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(clothingEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public String getClothNameByClothId(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("clothingCompany");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select name.clothName from ClothingEntity name where name.clothId=:cid");
        query.setParameter("cid", id);
        String isget = query.getSingleResult().toString();


        return isget;
    }

    @Override
    public String getClothTypeById(int i) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("clothingCompany");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Query query = entityManager.createQuery("select c.type from ClothingEntity c where c.clothId=:cid");
        query.setParameter("cid",i);
       String clothType= query.getSingleResult().toString();
       return clothType;



    }

    @Override
    public List<ClothingEntity> getAllClothingDetaisl() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("clothingCompany");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Query query = entityManager.createQuery("select ref from ClothingEntity ref ");
        List<ClothingEntity> allClothings=query.getResultList();
        return allClothings;

    }


}
