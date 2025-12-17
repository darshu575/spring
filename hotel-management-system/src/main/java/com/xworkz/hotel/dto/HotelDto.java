package com.xworkz.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HotelDto {


    private  String hotelName;
    private String location;
    private String foodType;//veg or Non Veg
    private String foodName;
    private int price;
    private  int quantity;


}
