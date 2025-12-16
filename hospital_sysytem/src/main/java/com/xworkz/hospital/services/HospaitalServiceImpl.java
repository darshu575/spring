package com.xworkz.hospital.services;

import com.xworkz.hospital.dao.HospitalDAo;
import com.xworkz.hospital.dto.HospitalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HospaitalServiceImpl implements HospitalService{

    @Autowired
    HospitalDAo hospitalDAo;


    @Override
    public boolean validateAndSave(HospitalDto hospitalDto) {
        System.out.println("ValidateAndSave class started");

        boolean isInValid = false;

        if (hospitalDto.getPatientName() == null
                || hospitalDto.getPatientName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Patient Name");
        }

        else if (hospitalDto.getPatientAge() == null
                || hospitalDto.getPatientAge() <= 0
                || hospitalDto.getPatientAge() > 120) {
            isInValid = true;
            System.out.println("Invalid Patient Age");
        }

        else if (hospitalDto.getPhoneNumber() == null
                || !hospitalDto.getPhoneNumber().toString().matches("\\d{10}")) {
            isInValid = true;
            System.out.println("Invalid Phone Number");
        }

        else if (hospitalDto.getFatherName() == null
                || hospitalDto.getFatherName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Father Name");
        }

        else if (hospitalDto.getDisease() == null
                || hospitalDto.getDisease().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Disease");
        }

        else {
            hospitalDAo.save(hospitalDto);
            System.out.println("Hospital data saved successfully");
        }

        System.out.println("ValidateAndSave class Ended");
        return isInValid;

    }
}
