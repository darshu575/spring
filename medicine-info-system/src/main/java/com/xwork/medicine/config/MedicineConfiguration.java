package com.xwork.medicine.config;

import com.xwork.medicine.controler.MedicineControler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xwork.medicine")
public class MedicineConfiguration {
    public MedicineConfiguration(){
        System.out.println("MedicineConfiguration object id created");
    }


}
