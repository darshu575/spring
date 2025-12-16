package com.xworkz.patient.impl;

import com.xworkz.patient.interfac.Address;
import com.xworkz.patient.interfac.Country;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class AddressImpl implements Address {
    @Value("Chitradurga")
    public String PatientAddrees;



@Autowired
     Country country;



    @Override
    public void getAddress() {
        System.out.println("Enter the addres");
        System.out.println(getPatientAddrees());
        country.getCountry();

        System.out.println("Leave the address");

    }
}
