package com.xworkz.darshan_xworkzModul.dao.memberDao;

import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MemberDaoImpl implements MemberDao{
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean saveMember(MemberEntity entity) {
        System.out.println("Member Save Dao");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        System.out.println("Saving member: " + entity.getMemberName());

        entityManager.getTransaction().commit();

        return true;
    }

    @Override
    public List<MemberEntity> getAllMemberById(int teamId) {

        EntityManager entityManager=entityManagerFactory.createEntityManager();
       Query query= entityManager.createQuery("SELECT m FROM MemberEntity m WHERE m.team.teamId = :teamid");
       query.setParameter("teamid",teamId);
       List<MemberEntity> member=query.getResultList();
       entityManager.close();
        return member;
    }
}
