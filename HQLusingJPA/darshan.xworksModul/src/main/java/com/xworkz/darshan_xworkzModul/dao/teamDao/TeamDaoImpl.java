package com.xworkz.darshan_xworkzModul.dao.teamDao;

import com.xworkz.darshan_xworkzModul.entity.teamEntity.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public class TeamDaoImpl implements TeamDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(TeamEntity teamEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(teamEntity);
        entityManager.getTransaction().commit();

        return true;
    }

    @Override
    public List<TeamEntity> getAllTeams() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("from TeamEntity t");
        List<TeamEntity> teams = query.getResultList();

        System.out.println(teams);
        entityManager.close();
        return teams;
    }

    @Override
    public TeamEntity getId(int teamId) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
       TeamEntity team= entityManager.find(TeamEntity.class,teamId);
       entityManager.close();
       return team;
    }


}
