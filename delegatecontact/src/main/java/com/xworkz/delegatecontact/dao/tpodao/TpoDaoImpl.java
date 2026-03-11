package com.xworkz.delegatecontact.dao.tpodao;

import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.xml.ws.Action;
import java.util.Collections;
import java.util.List;

@Repository
public class TpoDaoImpl implements TpoDao{
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public TpoEntity getTpoByemail(String email) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
          Query query= entityManager.createQuery("from TpoEntity t where t.email=:temail", TpoEntity.class);

          query.setParameter("temail",email);
         TpoEntity tpo= (TpoEntity) query.getSingleResult();
         return tpo;
        } catch (Exception e) {
            return null;// if email is not there in Tpo Table
        }


    }

    @Override
    public List<EventEntity> getAssignedEventByEmail(String email) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
            Query query=entityManager.createQuery("SELECT DISTINCT e FROM EventEntity e JOIN e.tpoList t WHERE t.email = :temail", EventEntity.class);
            query.setParameter("temail",email);

            return query.getResultList();

        }finally {
            entityManager.close();
        }


    }

    @Override
    public int countEvents(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Long count;
        try {
            Query query = entityManager.createQuery(
                    "SELECT COUNT(t) FROM TpoEntity t WHERE t.email = :temail"
            );
            query.setParameter("temail", email);
            count = (Long) query.getSingleResult();


        } finally {
            entityManager.close();
        }
        return count.intValue();
    }
}
