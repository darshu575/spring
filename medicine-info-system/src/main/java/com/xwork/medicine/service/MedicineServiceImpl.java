package com.xwork.medicine.service;

import com.xwork.medicine.dao.MedicineDAo;
import com.xwork.medicine.dto.MedicineDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MedicineServiceImpl implements MedicineService{
@Autowired
    MedicineDAo medicineDAo;

    @Override
    public boolean validateAndSave(MedicineDto medicineDto) {



        boolean isInValid = false;

        if (medicineDto.getMedicineName() == null
                || medicineDto.getMedicineName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Medicine Name");
        }

        else if (medicineDto.getMedicinePrice() == null
                || medicineDto.getMedicinePrice() <= 0) {
            isInValid = true;
            System.out.println("Invalid Medicine Price");
        }

        else if (medicineDto.getMedicineMg() == null
                || !medicineDto.getMedicineMg().matches("\\d+mg")) {
            isInValid = true;
            System.out.println("Invalid Medicine MG (Example: 500mg)");
        }

        else if (medicineDto.getCombination() == null
                || medicineDto.getCombination().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Combination");
        }

        else if (medicineDto.getExpiryDate() == null
                || !medicineDto.getExpiryDate().matches("\\d{2}-\\d{2}-\\d{4}")) {
            isInValid = true;
            System.out.println("Invalid Expiry Date (DD-MM-YYYY)");
        }

        else {
            System.out.println("Medicine data Validate successfully");
         return  medicineDAo.save(medicineDto);

        }

        return isInValid;
    }

    }

