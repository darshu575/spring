package com.xworkz.personalLoan.dao;

import com.xworkz.personalLoan.constant.DbConstant;
import com.xworkz.personalLoan.dto.PersonalLoanDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class PersonalLoanDAoImpl implements PersonalLoanDAo {
    @Override
    @SneakyThrows
    public void save(PersonalLoanDto personalLoanDto) {

        String insertQuery = "insert into personal_loan(fullname,phone_no,pan_no,aadhar_no,age,credit_score) values(?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DbConstant.URL.getProp(), DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)

        ) {
            {
                preparedStatement.setString(1, personalLoanDto.getFullName());
                preparedStatement.setLong(2, personalLoanDto.getPhoneNumber());
                preparedStatement.setString(3, personalLoanDto.getPanNumber());
                preparedStatement.setLong(4, personalLoanDto.getAaddarNumber());
                preparedStatement.setInt(5, personalLoanDto.getAge());
                preparedStatement.setInt(6, personalLoanDto.getCreditScore());
                int row = preparedStatement.executeUpdate();
                System.out.println("RowEffected" + row);


            }

        }
    }
}
