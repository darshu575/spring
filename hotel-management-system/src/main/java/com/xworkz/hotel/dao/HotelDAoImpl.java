package com.xworkz.hotel.dao;

import com.xworkz.hotel.constant.DBConstant;
import com.xworkz.hotel.dto.HotelDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Component
public class HotelDAoImpl implements HotelDAo{
    @SneakyThrows
    @Override
    public boolean save(HotelDto hotelDto) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        boolean isFoodAdded=false;
       String insertQuery="insert into hotel_food(hotel_name,location,food_type,food_name,price,quantity) values(?,?,?,?,?,?)";

       try (Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);

       ){
           preparedStatement.setString(1,hotelDto.getHotelName());
           preparedStatement.setString(2,hotelDto.getLocation());
           preparedStatement.setString(3,hotelDto.getFoodType());
           preparedStatement.setString(4,hotelDto.getFoodName());
           preparedStatement.setInt(5,hotelDto.getPrice());
           preparedStatement.setInt(6,hotelDto.getQuantity());

         int rows=  preparedStatement.executeUpdate();
           System.out.println("Rows Effected"+rows);

         if (rows<0){
             isFoodAdded=true;
             return isFoodAdded;

         }

       }
return  isFoodAdded;

    }
}
