package com.xwork.medicine.controler;

import com.xwork.medicine.dto.MedicineDto;
import com.xwork.medicine.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MedicineControler {

@Autowired
MedicineService service;
    public MedicineControler(){
        System.out.println("MedicineControler object is created");
    }


    @PostMapping("/addMedicine")
    public String addMedicine(MedicineDto medicineDto){
        System.out.println(medicineDto);
        boolean medicineSaved=service.validateAndSave(medicineDto);
        if (medicineSaved){
            return "Response.jsp";
        }
        else

        return "error.jsp";


    }



}
