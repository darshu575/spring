package com.xworkz.patient.impl;

import com.xworkz.patient.interfac.Street;
import org.springframework.stereotype.Component;

@Component
public class StreetImpl implements Street {
    @Override
    public void getStreet() {

        System.out.println("Enter Street");


        System.out.println("Leave Street");

    }
}
