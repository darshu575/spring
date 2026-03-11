package com.xworkz.delegatecontact.dao.delegatedao;

import com.xworkz.delegatecontact.entity.DelegateEntity;
import com.xworkz.delegatecontact.entity.RespondEntity;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class DelegateDaoImpl implements DelegateDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveDelegate(DelegateEntity delegateEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(delegateEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public EventEntity getEventBuId(int eventId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(EventEntity.class, eventId);
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<DelegateEntity> getDelegateByType(String delegateType) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery(" FROM DelegateEntity d WHERE d.delegateType = :dtype ", DelegateEntity.class);
            query.setParameter("dtype", delegateType);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean saveRespond(RespondEntity respondEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(respondEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public List<RespondEntity> getRespondByTpo(String tpoEmail) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<RespondEntity> list;
        try {
            Query query = entityManager.createQuery("FROM RespondEntity r where r.tpoEmail.email=:tEmail");
            query.setParameter("tEmail", tpoEmail);

            list = query.getResultList();
        } finally {
            entityManager.close();
        }
        return list;
    }

    @Override
    public int countEmailSent(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Long count;
        try {
            Query query = entityManager.createQuery(
                    "SELECT COUNT(d) FROM DelegateEntity d"
            );

            count = (Long) query.getSingleResult();


        } finally {
            entityManager.close();
        }
        return count.intValue();
    }

    @Override
    public int countResponses(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Long count;
        try {
            Query query = entityManager.createQuery(
                    "SELECT COUNT(r) FROM RespondEntity r WHERE r.tpoEmail = :tpemail"
            );
            query.setParameter("tpemail", email);
            count = (Long) query.getSingleResult();


        } finally {
            entityManager.close();
        }
        return count.intValue();
    }
}



