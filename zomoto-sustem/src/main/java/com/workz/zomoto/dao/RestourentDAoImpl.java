package com.workz.zomoto.dao;

import com.workz.zomoto.contant.DBConstant;
import com.workz.zomoto.dto.RestourentDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Component
public class RestourentDAoImpl implements RestourentDAo {

    @SneakyThrows
    @Override
    public boolean save(RestourentDto restourentDto) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        boolean isRestoAdded = false;

        String insertQuery = "insert into restaurant(restaurant_name,owner_name,age,gmail,number,country,state,city,branch,gst) values (?,?,?,?,?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        ) {
            preparedStatement.setString(1, restourentDto.getRestourentName());
            preparedStatement.setString(2, restourentDto.getOwnerName());
            preparedStatement.setInt(3, restourentDto.getAge());
            preparedStatement.setString(4, restourentDto.getGmail());
            preparedStatement.setLong(5, restourentDto.getNumber());
            preparedStatement.setString(6, restourentDto.getCountry());
            preparedStatement.setString(7, restourentDto.getState());
            preparedStatement.setString(8, restourentDto.getCity());
            preparedStatement.setString(9, restourentDto.getBranch());
            preparedStatement.setString(10, restourentDto.getGst());

            int rows = preparedStatement.executeUpdate();
            System.out.println("RowsEffected" + rows);

            if (rows < 0) {
                isRestoAdded = true;

                return isRestoAdded;
            }

        }
return  isRestoAdded;

    }
}
