package com.xworkz.hotel.service;

import com.xworkz.hotel.dao.HotelDAo;
import com.xworkz.hotel.dto.HotelDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelServiceImpl  implements HotelService{
    @Autowired
    HotelDAo hotelDAo;

    @Override
    public boolean validateAndSave(HotelDto hotelDto) {

            boolean isInValid = false;

            if (hotelDto.getHotelName() == null
                    || hotelDto.getHotelName().trim().length() < 3) {
                isInValid = true;
                System.out.println("Invalid Hotel Name");
            }

            else if (hotelDto.getLocation() == null
                    || hotelDto.getLocation().trim().length() < 3) {
                isInValid = true;
                System.out.println("Invalid Location");
            }


            else if (hotelDto.getFoodType() == null) {
                isInValid = true;
                System.out.println("Invalid Food Type (Veg / Non Veg)");
            }

            else if (hotelDto.getFoodName() == null
                    || hotelDto.getFoodName().trim().length() < 3) {
                isInValid = true;
                System.out.println("Invalid Food Name");
            }

            else if (hotelDto.getPrice() <= 0) {
                isInValid = true;
                System.out.println("Invalid Price");
            }

            else if (hotelDto.getQuantity() <= 0) {
                isInValid = true;
                System.out.println("Invalid Quantity");
            }

            else {
                System.out.println("Food data Validate SuccessFully");
                return hotelDAo.save(hotelDto);
            }

            return isInValid;
        }




    }

