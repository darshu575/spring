package com.xworkz.darshan_xworkzModul.dao;

import com.xworkz.darshan_xworkzModul.entity.OtpEntity;
import com.xworkz.darshan_xworkzModul.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(UserEntity userEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userEntity);
        entityManager.getTransaction().commit();
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().getClass();


        System.out.println(userEntity);
        return true;
    }

    @Override
    public UserEntity getGmail(String gmail) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("from UserEntity g where g.email=:ugamil", UserEntity.class);
        query.setParameter("ugamil", gmail);
        UserEntity userEntity = (UserEntity) query.getSingleResult();
        return userEntity;


    }

    @Override
    public int getCount(String gmail) {


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select g.count from UserEntity g where g.email=:ugamil");
        query.setParameter("ugamil", gmail);
        int userEntity = (int) query.getSingleResult();
        return userEntity;
    }

    @Override
    public void getCountGmail(String gmail) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update UserEntity u set u.count=u.count+1 where u.email=:ugamil");
        query.setParameter("ugamil", gmail);
        query.executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateCount(String gmail) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update UserEntity u set u.count=0 where u.email=:ugamil");
        query.setParameter("ugamil", gmail);
        query.executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public void saveOtp(OtpEntity otpEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(otpEntity);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public OtpEntity findOtpByGmail(String email, String otp) {
        System.out.println("findOtpByGmail started");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery("select o from OtpEntity o where o.email=:Ogamil and  o.otp=:Ootp");
            query.setParameter("Ogamil", email);
            query.setParameter("Ootp", otp);
            OtpEntity otpEntity = (OtpEntity) query.getSingleResult();
            System.out.println(otpEntity);

            return otpEntity;


        } catch (Exception e) {

        } finally {
            entityManager.close();
        }


        return null;
    }

    @Override
    public void deleteOpt(OtpEntity dbOtp) {
        System.out.println("deleteOpt started");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            OtpEntity merged = entityManager.merge(dbOtp);
            entityManager.remove(merged);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().commit();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean updatePassword(String email, String encryptNewPassowrd) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("update  UserEntity u set u.password=:nPassword where u.email=:oldEmail");
            query.setParameter("nPassword", encryptNewPassowrd);
            query.setParameter("oldEmail", email);
          int isUpadate=  query.executeUpdate();
          entityManager.getTransaction().commit();
          if (isUpadate > 0){
              return true;
          }

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public UserEntity getUserDetailsByEmail(String email) {

        System.out.println("getUserDetailsByEmail Dao Started");

        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
          Query query= entityManager.createQuery("FROM UserEntity e WHERE e.email = :getEmail");
          query.setParameter("getEmail",email);
         UserEntity users = (UserEntity) query.getSingleResult();
            System.out.println("Get User Details in Dao "+users);

return users;
        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public boolean updateUserDetails(UserEntity userEntity) {
        System.out.println("updateUserDetails DAo Started");

        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery(
                    "UPDATE UserEntity u SET " +
                            "u.userName = :name, " +
                            "u.email = :uemail, " +
                            "u.phoneNumber = :phone, " +
                            "u.age = :age, " +
                            "u.gender = :gender, " +
                            "u.address = :address, " +
                            "u.userProfilePath = :imagePath " +
                            "WHERE u.email = :wemail"
            );
          query.setParameter("name",userEntity.getUserName());
          query.setParameter("uemail",userEntity.getEmail());
          query.setParameter("phone",userEntity.getPhoneNumber());
          query.setParameter("age",userEntity.getAge());
          query.setParameter("gender",userEntity.getGender());
          query.setParameter("address",userEntity.getAddress());
          query.setParameter("imagePath",userEntity.getUserProfilePath());
          query.setParameter("wemail",userEntity.getEmail());
          int updatedRows=query.executeUpdate();
            entityManager.getTransaction().commit();
            System.out.println("Updated rows is"+updatedRows);
          if (updatedRows>0){
              System.out.println("User Details Is Updated");
              return true;
          }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            entityManager.close();
        }


        return false;
    }

}
