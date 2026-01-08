package com.xworkz.bloodbank.dao;

import com.xworkz.bloodbank.constant.DBConstant;
import com.xworkz.bloodbank.dto.BloodBankDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Repository
public class BloodBankDaoImpl implements BloodBankDao {
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
                 isCreated=true;
                 return isCreated;

            }


        }


        return false;
    }
}
