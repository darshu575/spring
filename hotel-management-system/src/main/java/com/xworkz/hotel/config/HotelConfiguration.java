package com.xworkz.hotel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.xworkz.hotel")
public class HotelConfiguration {

    public HotelConfiguration(){
        System.out.println("HotelConfiguration Object created");
    }


}
