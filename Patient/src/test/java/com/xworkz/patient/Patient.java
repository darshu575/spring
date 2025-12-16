package com.xworkz.patient;


import com.xworkz.patient.interfac.Address;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Patient {

    @Autowired
    private Address address;

    public  void getPatientAddress(){
        System.out.println("Enter the patient address");
            address.getAddress();
        System.out.println("Leave the patient address");
    }


}
