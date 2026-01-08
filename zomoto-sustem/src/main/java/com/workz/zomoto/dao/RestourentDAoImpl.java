package com.workz.zomoto.dao;

import com.workz.zomoto.contant.DBConstant;
import com.workz.zomoto.dto.RestourentDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        return isRestoAdded;

    }

    @SneakyThrows
    @Override
    public Optional<RestourentDto> getByRestoName(String restoname) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        boolean isRestoAdded = false;

        String selectQuery = "select * from restaurant where restaurant_name=?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        ) {
            preparedStatement.setString(1, restoname);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String restoName = resultSet.getString(2);
                String ownerName = resultSet.getString(3);
                Integer age = resultSet.getInt(4);
                String gmail = resultSet.getString(5);
                Long number = resultSet.getLong(6);
                String country = resultSet.getString(7);
                String state = resultSet.getString(8);
                String city = resultSet.getString(9);
                String branch = resultSet.getString(10);
                String gst = resultSet.getString(11);

                RestourentDto restourentDto = new RestourentDto(restoName, ownerName, age, gmail, number, country, state, city, branch, gst);
                System.out.println(restourentDto);

                return Optional.of(restourentDto);


            }


        }
        return Optional.empty();
    }

    @SneakyThrows
    @Override
    public Optional<RestourentDto> getByGmail(String gmail) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        boolean isRestoAdded = false;

        String selectQuery = "select * from restaurant where gmail=?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        ) {
            preparedStatement.setString(1, gmail);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String restoName = resultSet.getString(2);
                String ownerName = resultSet.getString(3);
                Integer age = resultSet.getInt(4);
                String Rgmail = resultSet.getString(5);
                Long number = resultSet.getLong(6);
                String country = resultSet.getString(7);
                String state = resultSet.getString(8);
                String city = resultSet.getString(9);
                String branch = resultSet.getString(10);
                String gst = resultSet.getString(11);

                RestourentDto restourentDto1 = new RestourentDto(restoName, ownerName, age, Rgmail, number, country, state, city, branch, gst);
                System.out.println(restourentDto1);

                return Optional.of(restourentDto1);
            }


        }
        return Optional.empty();

    }
@SneakyThrows
    @Override
    public List<RestourentDto> getByName(String name) {
        List<RestourentDto> list=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        boolean isRestoAdded = false;

        String selectQuery = "select * from restaurant where restaurant_name=?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        ) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String restoName = resultSet.getString(2);
                String ownerName = resultSet.getString(3);
                Integer age = resultSet.getInt(4);
                String gmail = resultSet.getString(5);
                Long number = resultSet.getLong(6);
                String country = resultSet.getString(7);
                String state = resultSet.getString(8);
                String city = resultSet.getString(9);
                String branch = resultSet.getString(10);
                String gst = resultSet.getString(1);

                RestourentDto restourentDto = new RestourentDto(restoName, ownerName, age, gmail, number, country, state, city, branch, gst);
                list.add(restourentDto);
                System.out.println(restourentDto);

                return list;


            }


        return Collections.emptyList();
    }


}
@SneakyThrows
    @Override
    public boolean update(RestourentDto restourentDto) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        boolean isUpdate = false;

        String updateQuery = "update restaurant set restaurant_name=?,owner_name=?,age=?,gmail=?,number=?,country=?,state=?,city=?,branch=?,gst=? where restaurant_name=?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

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
            preparedStatement.setString(11,restourentDto.getRestourentName());

            int rows = preparedStatement.executeUpdate();
            System.out.println("RowsEffected" + rows);

            if (rows < 0) {
                isUpdate = true;

                return isUpdate;
            }

        }

        return false;
    }
}




