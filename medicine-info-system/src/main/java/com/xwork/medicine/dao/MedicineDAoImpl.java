package com.xwork.medicine.dao;

import com.xwork.medicine.constant.DBConstant;
import com.xwork.medicine.dto.MedicineDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Component
public class MedicineDAoImpl implements  MedicineDAo {
    @SneakyThrows
    @Override
    public boolean save(MedicineDto medicineDto) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        boolean isMedicineAdded = false;
        String insertQuery = "insert into medicine_info(medicine_name,medicine_price,medicine_mg,combination,expiry_date) values(?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        ) {
            preparedStatement.setString(1, medicineDto.getMedicineName());
            preparedStatement.setInt(2, medicineDto.getMedicinePrice());
            preparedStatement.setString(3, medicineDto.getMedicineMg());
            preparedStatement.setString(4, medicineDto.getCombination());
            preparedStatement.setString(5, medicineDto.getExpiryDate());
            int rows = preparedStatement.executeUpdate();
            System.out.println("RowsEffected" + rows);
            if (rows > 0) {
                isMedicineAdded = true;

                return isMedicineAdded;

            }


        }
        return isMedicineAdded;
    }
}