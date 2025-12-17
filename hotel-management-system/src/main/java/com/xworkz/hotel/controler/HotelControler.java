package com.xworkz.hotel.controler;


import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HotelControler {

    @Autowired
    HotelService service;

    public HotelControler() {
        System.out.println("HotelControler Object created");
    }

    @PostMapping("/addFood")
    public String addFood(HotelDto hotelDto) {
        System.out.println(hotelDto);

        boolean isAddFood = service.validateAndSave(hotelDto);

        if (isAddFood) {
            return "respones.jsp";
        }
        else
            return "error.jsp";



    }


}
