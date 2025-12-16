package com.xworkz.patient.impl;

import com.xworkz.patient.interfac.Area;
import com.xworkz.patient.interfac.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AreaImpl implements Area {
    @Autowired
    Street street;

    @Override
    public void getArea() {
        System.out.println("Enter area");

street.getStreet();
        System.out.println("Leave Area");
    }
}
