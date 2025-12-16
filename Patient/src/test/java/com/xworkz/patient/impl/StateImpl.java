package com.xworkz.patient.impl;

import com.xworkz.patient.interfac.City;
import com.xworkz.patient.interfac.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Stack;
@Component
public class StateImpl implements State {
    @Autowired
    City city;


    @Override
    public void getState() {
        System.out.println("Enter State");
     city.getCity();

        System.out.println("leave State");
    }
}
