package com.xworkz.delegatecontact.dao.tpodao;

import com.xworkz.delegatecontact.entity.eventEntity.TpoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.xml.ws.Action;

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
}
