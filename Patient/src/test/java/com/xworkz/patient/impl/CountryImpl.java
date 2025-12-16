package com.xworkz.patient.impl;

import com.xworkz.patient.interfac.Country;
import com.xworkz.patient.interfac.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryImpl implements Country {
    @Autowired
    State state;

    @Override
    public void getCountry() {
        System.out.println("Enter country");
state.getState();

        System.out.println("leave country");
    }
}
