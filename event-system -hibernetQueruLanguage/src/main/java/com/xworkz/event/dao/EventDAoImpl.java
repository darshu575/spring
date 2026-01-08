package com.xworkz.event.dao;

import com.xworkz.event.entity.EventEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class EventDAoImpl implements EventDAo {
    @Override
    public boolean save(EventEntity eventEntity) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(eventEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public EventEntity getEntity(int i) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventEntity entity = entityManager.find(EventEntity.class, i);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return entity;
    }

    @Override
    public boolean update(int i, EventEntity eventEntity) {
        boolean isUpdated = false;

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventEntity entityUpdate = entityManager.find(EventEntity.class, i);

        if (entityUpdate != null) {


            entityUpdate.setEventName(eventEntity.getEventName());
            entityUpdate.setLocation(eventEntity.getLocation());
            entityUpdate.setEventTime(eventEntity.getEventTime());
            entityUpdate.setEventManager(eventEntity.getEventManager());

            entityManager.merge(entityUpdate);
            isUpdated = true;
            entityManager.getTransaction().commit();
            return isUpdated;
        } else return isUpdated;
    }

    @Override
    public boolean deleteByIdDAO(int i) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        EventEntity entity = entityManager.find(EventEntity.class, i);

        if (entity != null) {
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public EventEntity EegetEventDetailsByEventName(String eventName) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("AllEventNames");
        query.setParameter("en", eventName);
        EventEntity entity = (EventEntity) query.getSingleResult();

        return entity;


    }

    @Override
    public EventEntity getEventDetailsByEventTime(String s) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select time from EventEntity time where time.eventTime=:etime");
        query.setParameter("etime", s);
        EventEntity entity = (EventEntity) query.getSingleResult();


        return entity;
    }

    @Override
    public Object[] getEventMangerAndLocationByEventName(String event) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select e.eventManager,e.location from EventEntity e where e.eventName= :name");
        query.setParameter("name", event);
        Object[] result = (Object[]) query.getSingleResult();
        entityManager.close();
        entityManagerFactory.close();


        return result;
    }

    @Override
    public List<EventEntity> getAllDetails() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllDetails");
        List<EventEntity> allresult = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();


        return allresult;
    }

    @Override
    public String getEventLocatioByEventTime(String time) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getEventLocatioByEventTime");
        query.setParameter("etime", time);
        String result = query.getSingleResult().toString();

        return result;
    }

    @Override
    public List<String> getEventNameByEventManger(String manger) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getEventNameByEventManger");
        query.setParameter("emaneger", manger);
        List<String> resultList = query.getResultList();
        return resultList;


    }

    @Override
    public boolean updateEventManagerByEventNameAndEventTime(String eventmanager, String ename, String time) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateManagerByEventNameAndTime");
        query.setParameter("emanager", eventmanager);
        query.setParameter("eventName", ename);
        query.setParameter("eventTime", time);

        int noOfRowsEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsEffected > 0)
            return true;

        return false;
    }

    @Override
    public boolean updateEventTtimeByEventManeger(String t, String managerName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateEventTimeByName");
        query.setParameter("etime", t);
        query.setParameter("eventName", managerName);
        int rowsEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (rowsEffected > 0) {
            return true;
        }
      return  false;


    }

    @Override
    public boolean DeletByEventManager(String managerName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("darshan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from EventEntity d where d.eventManager=:deleteManager ");
        query.setParameter("deleteManager",managerName);
        int rows=query.executeUpdate();
        entityManager.getTransaction().commit();
        if (rows>0){
            return true;
        }
        return false;
    }


}
