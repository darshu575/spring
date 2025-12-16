package com.xworkz.hospital.dao;

import com.xworkz.hospital.constant.DbConstant;
import com.xworkz.hospital.dto.HospitalDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Component

public class HospitalDAoImpl implements HospitalDAo{
    @SneakyThrows
    @Override
    public void save(HospitalDto hospitalDto) {

        String insertQuery = "insert into Hospital(patient_name,patient_age,phone_number,father_name,disease) values(?,?,?,?,?)";

        try(Connection connection= DriverManager.
                getConnection(DbConstant.URL.getProp(),DbConstant.USERNAME.getProp(), DbConstant.PASSWORD.getProp());
            PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
        ){
       preparedStatement.setString(1,hospitalDto.getPatientName());
       preparedStatement.setInt(2,hospitalDto.getPatientAge());
       preparedStatement.setLong(3,hospitalDto.getPhoneNumber());
       preparedStatement.setString(4,hospitalDto.getFatherName());
       preparedStatement.setString(5,hospitalDto.getDisease());
     int rows=  preparedStatement.executeUpdate();
            System.out.println("RowEffected"+rows);



        }






    }
}
