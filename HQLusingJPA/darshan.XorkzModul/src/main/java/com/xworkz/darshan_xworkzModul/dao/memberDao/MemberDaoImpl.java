package com.xworkz.darshan_xworkzModul.dao.memberDao;

import com.xworkz.darshan_xworkzModul.entity.memberEntity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
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
        System.out.println("GetAllMamber by id");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
       Query query= entityManager.createQuery( "FROM MemberEntity m WHERE m.team.teamId = :teamId");
       query.setParameter("teamId",teamId);
       List<MemberEntity> member=query.getResultList();
        System.out.println(member);
       entityManager.close();
        return member;
    }

    @Override
    public List<MemberEntity> getAllMemberEmails() {


        System.out.println("Getting all Member emails");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Query query=entityManager.createQuery(" From  MemberEntity e ");
        List<MemberEntity> memberEmails= query.getResultList();
        System.out.println(memberEmails);
        entityManager.close();
        return memberEmails;
    }
}
