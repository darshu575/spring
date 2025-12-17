package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelService {
    public  boolean validateAndSave(HotelDto hotelDto);
}
