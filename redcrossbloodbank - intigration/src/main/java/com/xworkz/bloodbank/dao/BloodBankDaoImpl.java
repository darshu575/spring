package com.xworkz.bloodbank.dao;

import com.xworkz.bloodbank.constant.DBConstant;
import com.xworkz.bloodbank.dto.BloodBankDto;
import com.xworkz.bloodbank.entity.RedCrossBloodEntity;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Repository
public class BloodBankDaoImpl implements BloodBankDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @SneakyThrows
    @Override
    public boolean save(BloodBankDto bloodBankDto) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        boolean isCreated = false;

        String insertQuery = "insert into blood_bank(donor_accountId,donor_first_name,donor_last_name,user_name,donor_dob,donor_zip_code,donor_phone_number,donor_gmail,password,confirm_password) values(?,?,?,?,?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        ) {
            preparedStatement.setString(1, bloodBankDto.getDonorAccountID());
            preparedStatement.setString(2, bloodBankDto.getDonorFirstName());
            preparedStatement.setString(3, bloodBankDto.getDonorLastName());
            preparedStatement.setString(4, bloodBankDto.getUserName());

            preparedStatement.setString(5, bloodBankDto.getDonorDob());

            preparedStatement.setInt(6, bloodBankDto.getDonorZipCode());

            preparedStatement.setLong(7, bloodBankDto.getDonorPhoneNumber());
            preparedStatement.setString(8, bloodBankDto.getDonorGmail());

            preparedStatement.setString(9, bloodBankDto.getPassword());
            preparedStatement.setString(10, bloodBankDto.getConfirmPassword());

            int rows = preparedStatement.executeUpdate();
            System.out.println("RowsEffected" + rows);

            if (rows < 0) {
                isCreated = true;
                return isCreated;

            }


        }


        return false;
    }


    @Override
    public boolean saveDonor(RedCrossBloodEntity redCrossBloodEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(redCrossBloodEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public RedCrossBloodEntity SearchEmail(String gmail) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            Query query = entityManager.createNamedQuery("SearchByEmail");
            query.setParameter("dgmail", gmail);

            RedCrossBloodEntity entity = (RedCrossBloodEntity) query.getSingleResult();


            System.out.println(entity);
            return  entity;
        } catch (NoResultException e) {
            return null;
        }

    }

    @Override
    public RedCrossBloodEntity searchByID(String id) {




        return null;
    }
}
