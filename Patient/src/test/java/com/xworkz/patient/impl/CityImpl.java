package com.xworkz.patient.impl;

import com.xworkz.patient.interfac.Area;
import com.xworkz.patient.interfac.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityImpl implements City {
    @Autowired
    Area area;


    @Override
    public void getCity() {
        System.out.println("Enter city");
area.getArea();
        System.out.println("Leave city");
    }
}
